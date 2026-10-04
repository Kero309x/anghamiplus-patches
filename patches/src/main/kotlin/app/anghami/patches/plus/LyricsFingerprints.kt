package app.anghami.patches.plus

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Lyrics fingerprints for Anghami 8.0.28.
 *
 * Evidence in decompiled code:
 * - Lcom/anghami/ghost/local/Account;->lyricsEnabled()Z
 *   Checks `if (!isPlusUser() && !this.lyricsfreeenabled) return false; return true;`
 *   Enforcing return true enables the lyrics view action in Player and LyricsActivity.
 * - Lcom/anghami/ghost/model/proto/ProtoAccount$Account;->getLyricsfreeenabled()Z
 *   Fills `Account.lyricsfreeenabled` during `Account.fillFromProto()`.
 *   Enforcing return true sets the local account state to allow free lyrics.
 * - Lcom/anghami/ghost/api/response/LyricsResponse;->isError()Z
 *   Checks `if (this.error == null && this.errorNumber == -1) return false; return true;`
 *   Enforcing return false prevents client from rejecting non-premium lyrics payloads.
 * - Lcom/anghami/app/lyrics/LyricsEpoxyController;->getLyricsUnlockButton()
 *   Returns the upsell "Unlock Full Lyrics" button model. Returning null eliminates
 *   the paywall banner at the bottom of the lyrics view.
 */

object LyricsEnabledFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/local/Account;",
    name = "lyricsEnabled",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf(),
)

object GetLyricsFreeEnabledFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/model/proto/ProtoAccount\$Account;",
    name = "getLyricsfreeenabled",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf(),
)

object LyricsResponseIsErrorFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/api/response/LyricsResponse;",
    name = "isError",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf(),
)

object LyricsUnlockButtonFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/app/lyrics/LyricsEpoxyController;",
    name = "getLyricsUnlockButton",
    parameters = listOf(),
)
