package app.anghami.patches.plus

import app.anghami.patches.shared.Constants.COMPATIBILITY_ANGHAMI_8_0_28
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch

/**
 * Allows taking screenshots and screen recordings in all activities.
 *
 * Targets:
 * - MainActivity.e1(boolean) -> return-void (prevents FLAG_SECURE from ever being applied to Window)
 */
@Suppress("unused")
val allowScreenshotsPatch = bytecodePatch(
    name = "Allow Screenshots",
    description = "Bypasses secure window restrictions to allow screenshots and screen recording across the app.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_ANGHAMI_8_0_28)

    execute {
        MainActivitySetSecureScreenFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
    }
}
