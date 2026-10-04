package app.anghami.patches.plus

import app.anghami.patches.shared.Constants.COMPATIBILITY_ANGHAMI_8_0_28
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction22c
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

/**
 * Displays the Plus badge on the profile header and account settings.
 *
 * In Anghami, the profile header (UserHeaderModel) checks Profile.isPlus to decide
 * whether to display the Plus badge next to the user's avatar.
 * This patch:
 * 1. Swaps the `iget-boolean <reg>, Profile;->isPlus:Z` check in UserHeaderModel._bind
 *    to `const/4 <reg>, 0x1` so the Plus badge is always rendered.
 * 2. Overrides `UserInfo.isPlus` and `SettingsRow$UserInfo.isPlus` to return true.
 */
@Suppress("unused")
val showProfilePlusBadgePatch = bytecodePatch(
    name = "Show Profile Plus Badge",
    description = "Displays the official Plus badge on your profile header and account settings.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_ANGHAMI_8_0_28)

    execute {
        val method = UserHeaderModelBindFingerprint.method
        val instructions = method.implementation!!.instructions
        val targetIndices = instructions.mapIndexedNotNull { index, ins ->
            if (ins.opcode == Opcode.IGET_BOOLEAN && ins is Instruction22c &&
                (ins.reference as? FieldReference)?.let {
                    it.name == "isPlus" && it.definingClass == "Lcom/anghami/ghost/pojo/Profile;"
                } == true
            ) {
                index
            } else {
                null
            }
        }
        check(targetIndices.size == 1) {
            "Expected 1 isPlus check in UserHeaderModel._bind, found ${targetIndices.size}"
        }
        val ins = instructions[targetIndices[0]] as Instruction22c
        method.replaceInstructions(targetIndices[0], "const/4 v${ins.registerA}, 0x1")

        UserInfoIsPlusFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )

        SettingsRowUserInfoIsPlusFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )
    }
}
