package app.anghami.patches.plus

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.anghami.patches.shared.Constants.COMPATIBILITY_ANGHAMI_8_0_28

/**
 * Target: Anghami 8.0.28 (versionCode 8000280, package com.anghami)
 *
 * Full Lyrics & Synced View Unblocker:
 * - Account.lyricsEnabled() -> returns true (enables lyrics entry point in player and LyricsActivity)
 * - ProtoAccount$Account.getLyricsfreeenabled() -> returns true (sets local account state)
 * - LyricsResponse.isError() -> returns false (prevents API response error rejection)
 * - LyricsEpoxyController.getLyricsUnlockButton() -> returns null (removes bottom paywall / upsell button)
 */
@Suppress("unused")
val unlockFullLyricsPatch = bytecodePatch(
    name = "Unlock Full Lyrics",
    description = "Enables full synced lyrics display and removes paywall banners on song lyrics.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_ANGHAMI_8_0_28)

    execute {
        LyricsEnabledFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )

        GetLyricsFreeEnabledFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )

        LyricsResponseIsErrorFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )

        LyricsUnlockButtonFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return-object v0
            """
        )
    }
}
