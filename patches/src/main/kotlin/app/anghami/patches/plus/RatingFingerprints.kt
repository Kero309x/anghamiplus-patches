package app.anghami.patches.plus

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.opcode
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

/**
 * Fingerprints for disabling the in-app "Love us? Rate us!" prompts.
 *
 * Target: Anghami 8.0.28
 * Class: com.anghami.ghost.rating.AppRater
 */

object AppRaterShouldShowDialogFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/rating/AppRater;",
    name = "getShouldShowDialog",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(
        opcode(Opcode.RETURN),
    )
)

object AppRaterUpdateOnLaunchFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/rating/AppRater;",
    name = "updateOnLaunch",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = emptyList(),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object AppRaterOnUserEventFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/rating/AppRater;",
    name = "onUserEvent",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("Lcom/anghami/ghost/rating/AppRater\$Events;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)
