package app.anghami.patches.plus

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.opcode
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

/**
 * Fingerprint for bypassing FLAG_SECURE window security restrictions.
 *
 * Target: Anghami 8.0.28
 * Class: com.anghami.app.main.MainActivity
 * Method: e1(boolean)
 */

object MainActivitySetSecureScreenFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/app/main/MainActivity;",
    name = "e1",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("Z"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)
