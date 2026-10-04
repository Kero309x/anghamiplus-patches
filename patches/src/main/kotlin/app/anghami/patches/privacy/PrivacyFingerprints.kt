package app.anghami.patches.privacy

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.opcode
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

/**
 * Telemetry, analytics, and crash logging targets (Anghami 8.0.28).
 *
 * Targets:
 * - In-house event tracking (Analytics.postEvent, SiloManager.saveSiloEvent*)
 * - Third-party analytics SDKs (Adjust, Amplitude, Branch, Google Analytics)
 * - Crash and error delivery (Bugsnag NativeInterface.deliverReport)
 */

object AnalyticsInitFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/analytics/Analytics;",
    name = "init",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf(
        "Ljava/lang/String;",
        "Z",
        "Lcom/anghami/ghost/analytics/Analytics\$FacebookAppEventLogger;",
    ),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object AnalyticsPostEventFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/analytics/Analytics;",
    name = "postEvent",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Lcom/anghami/ghost/analytics/Events\$AnalyticsEvent;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object AnalyticsPostEventStringFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/analytics/Analytics;",
    name = "postEvent",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object AnalyticsPostGoogleAnalyticsFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/analytics/Analytics;",
    name = "postGoogleAnalyticsEvent",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;", "Landroid/os/Bundle;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object AnalyticsPostAdjustEventFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/analytics/Analytics;",
    name = "postAdjustEvent",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object SiloSaveEventAsyncFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/reporting/SiloManager;",
    name = "saveSiloEventAsync",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf(
        "Lcom/anghami/ghost/proto/SiloEventsProto\$Event\$Builder;",
        "Ljava/lang/String;",
    ),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object SiloSaveEventSyncFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/reporting/SiloManager;",
    name = "saveSiloEventSync",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf(
        "Lcom/anghami/ghost/proto/SiloEventsProto\$Event\$Builder;",
        "Ljava/lang/String;",
    ),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object BugsnagDeliverReportFingerprint : Fingerprint(
    definingClass = "Lcom/bugsnag/android/NativeInterface;",
    name = "deliverReport",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("[B", "[B", "[B", "Ljava/lang/String;", "Z"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)
