package app.anghami.patches.download

import app.anghami.patches.core.AnghamiTarget
import app.anghami.patches.core.forceFalse
import app.anghami.patches.core.forceTrue
import app.anghami.patches.core.forceVoid
import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Neutralises the offline-download guards that the client evaluates before a
 * track may be saved for offline listening.
 *
 * The quota assertions in the download manager become no-ops, the limited-plan
 * test always reports false, the locally reported offline song/time ceilings
 * are raised, and both the "can go live" and the download-disabling account
 * flags are forced into their permissive state.
 *
 * These checks are client side only: the server keeps deciding which download
 * files an account is actually entitled to receive.
 */
@Suppress("unused")
val offlineLimitUnlockPatch = bytecodePatch(
    name = "Expand Download Limits",
    description = "Removes local offline storage caps and disables limited-plan quota checks.",
    default = true,
) {
    compatibleWith(AnghamiTarget.COMPATIBILITY)

    execute {
        AssertDownloadLimitReachedSignature.method.forceVoid()
        AssertDownloadRestrictionsSignature.method.forceVoid()
        IsOnLimitedPlanSignature.method.forceFalse()
        MaxOfflineSongsSignature.method.addInstructions(
            0,
            """
                const v0, 0xf423f
                return v0
            """
        )
        MaxOfflineTimeSignature.method.addInstructions(
            0,
            """
                const v0, 0xf423f
                return v0
            """
        )
        GetCanGoLiveSignature.method.forceTrue()
        GetDisableDownloadsSignature.method.forceFalse()
        IsDisabledDownloadsSignature.method.forceFalse()
    }
}

/** `DownloadManager.isOnLimitedPlan(Account)`. */
object IsOnLimitedPlanSignature : Fingerprint(
    definingClass = "Lcom/anghami/ghost/downloads/DownloadManager;",
    name = "isOnLimitedPlan",
    returnType = "Z",
    parameters = listOf("Lcom/anghami/ghost/local/Account;"),
)

/** `DownloadManager.assertDownloadLimitReached(Account, int)`. */
object AssertDownloadLimitReachedSignature : Fingerprint(
    definingClass = "Lcom/anghami/ghost/downloads/DownloadManager;",
    name = "assertDownloadLimitReached",
    returnType = "V",
    parameters = listOf("Lcom/anghami/ghost/local/Account;", "I"),
)

/** `DownloadManager.assertDownloadRestrictions(Account, int, SongDownloadReason)`. */
object AssertDownloadRestrictionsSignature : Fingerprint(
    definingClass = "Lcom/anghami/ghost/downloads/DownloadManager;",
    name = "assertDownloadRestrictions",
    returnType = "V",
    parameters = listOf(
        "Lcom/anghami/ghost/local/Account;",
        "I",
        "Lcom/anghami/ghost/objectbox/models/downloads/SongDownloadReason;",
    ),
)

/** `ProtoAccount$Account.getMaxOfflineSongs()`. */
object MaxOfflineSongsSignature : Fingerprint(
    definingClass = "Lcom/anghami/ghost/model/proto/ProtoAccount\$Account;",
    name = "getMaxOfflineSongs",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "I",
    parameters = listOf(),
)

/** `ProtoAccount$Account.getMaxOfflineTime()`. */
object MaxOfflineTimeSignature : Fingerprint(
    definingClass = "Lcom/anghami/ghost/model/proto/ProtoAccount\$Account;",
    name = "getMaxOfflineTime",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "I",
    parameters = listOf(),
)

/** `ProtoAccount$Account.getCanGoLive()`. */
object GetCanGoLiveSignature : Fingerprint(
    definingClass = "Lcom/anghami/ghost/model/proto/ProtoAccount\$Account;",
    name = "getCanGoLive",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf(),
)

/** `ProtoAccount$Account.getDisableDownloads()`. */
object GetDisableDownloadsSignature : Fingerprint(
    definingClass = "Lcom/anghami/ghost/model/proto/ProtoAccount\$Account;",
    name = "getDisableDownloads",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf(),
)

/** `Account.isDisabledDownloads()`. */
object IsDisabledDownloadsSignature : Fingerprint(
    definingClass = "Lcom/anghami/ghost/local/Account;",
    name = "isDisabledDownloads",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf(),
)
