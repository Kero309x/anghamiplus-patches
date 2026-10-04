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
 */
@Suppress("unused")
val disableAnalyticsPatch = bytecodePatch(
    name = "Disable Analytics & Crash Logging",
    description = "Disables third-party trackers, in-house user activity logging (Silo), and Bugsnag crash reporting.",
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
    }
}
