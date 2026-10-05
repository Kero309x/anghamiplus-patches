package app.anghami.patches.plus

import app.anghami.patches.shared.Constants.COMPATIBILITY_ANGHAMI_8_0_28
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch

/**
 * Removes sponsored items, recommended promotions in Car Mode, and radar sponsored cards.
 *
 * Targets:
 * - PreferenceHelper.getShowCarModeSponsor() -> returns false
 * - SectionInfo.getSponsored() -> returns false
 * - ProtoModels$Song.getSponsored() -> returns false
 * - PreferenceHelper.getACRSponsoredText() -> returns null
 */
@Suppress("unused")
val removeSponsoredContentPatch = bytecodePatch(
    name = "Remove Sponsored Content",
    description = "Hides sponsored cards, recommended promotions in Car Mode, and radar sponsored content.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_ANGHAMI_8_0_28)

    execute {
        PreferenceCarModeSponsorFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )

        SectionInfoSponsoredFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )

        SongSponsoredFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )

        ACRSponsoredTextFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return-object v0
            """
        )
    }
}
