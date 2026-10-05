package app.anghami.patches.plus

import app.anghami.patches.shared.Constants.COMPATIBILITY_ANGHAMI_8_0_28
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch

/**
 * Disables the in-app "Love us? Rate us!" prompt and review dialogs.
 *
 * Targets:
 * - AppRater.getShouldShowDialog() -> returns false
 * - AppRater.updateOnLaunch() -> no-op
 * - AppRater.onUserEvent() -> no-op
 */
@Suppress("unused")
val disableInAppRatingPatch = bytecodePatch(
    name = "Disable In-App Rating",
    description = "Disables the in-app review dialogs and 'Love us? Rate us!' rating prompts.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_ANGHAMI_8_0_28)

    execute {
        AppRaterShouldShowDialogFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )

        AppRaterUpdateOnLaunchFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )

        AppRaterOnUserEventFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
    }
}
