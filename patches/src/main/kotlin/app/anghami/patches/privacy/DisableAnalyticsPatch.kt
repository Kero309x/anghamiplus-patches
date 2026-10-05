package app.anghami.patches.privacy

import app.anghami.patches.shared.Constants.COMPATIBILITY_ANGHAMI_8_0_28
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch

/**
 * Disables tracking, telemetry, user activity logging, and crash reports.
 *
 * Targets:
 * - Analytics.init, Analytics.postEvent, Analytics.postGoogleAnalyticsEvent, Analytics.postAdjustEvent
 * - SiloManager.saveSiloEventAsync, SiloManager.saveSiloEventSync (internal activity tracking)
 * - NativeInterface.deliverReport (Bugsnag crash and error reporting)
 * - Braze SDK (Braze.logCustomEvent, BrazeCustomEventHelper)
 * - Real-time listening tracking (StatsUtils.sendRegisterActionStats, StatsUtils.startActionSave)
 * - Background ad reporting (BannerDisplaysReportWorker, BannerClicksReportWorker)
 * - Firebase Analytics (FirebaseAnalytics.logEvent)
 * - Share telemetry (Song.sendShareAnalyticsEventLegacy, Playlist.sendShareAnalyticsEventLegacy)
 */
@Suppress("unused")
val disableAnalyticsPatch = bytecodePatch(
    name = "Disable Analytics & Crash Logging",
    description = "Disables third-party trackers (Braze, Adjust, Firebase, Google, Bugsnag), in-house Silo tracking, and listening telemetry.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_ANGHAMI_8_0_28)

    execute {
        AnalyticsInitFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        AnalyticsPostEventFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        AnalyticsPostEventStringFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        AnalyticsPostGoogleAnalyticsFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        AnalyticsPostAdjustEventFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        SiloSaveEventAsyncFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        SiloSaveEventSyncFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        BugsnagDeliverReportFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        BrazeLogCustomEventFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        BrazeLogCustomEventWithPropsFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        BrazeCustomEventHelperLikeFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        BrazeCustomEventHelperPlaylistFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        StatsUtilsSendRegisterActionFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        StatsUtilsStartActionSaveFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        BannerDisplaysReportWorkerFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        BannerClicksReportWorkerFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        FirebaseAnalyticsLogEventFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        SongSendShareAnalyticsFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
        PlaylistSendShareAnalyticsFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
    }
}
