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
 * - Third-party analytics SDKs (Adjust, Amplitude, Branch, Google Analytics, Firebase Analytics, Braze)
 * - Real-time listening tracker (StatsUtils.sendRegisterActionStats)
 * - Background ad reporting (BannerDisplaysReportWorker, BannerClicksReportWorker)
 * - Share telemetry (Song.sendShareAnalyticsEventLegacy, Playlist.sendShareAnalyticsEventLegacy)
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

object BrazeLogCustomEventFingerprint : Fingerprint(
    definingClass = "Lcom/braze/Braze;",
    name = "logCustomEvent",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object BrazeLogCustomEventWithPropsFingerprint : Fingerprint(
    definingClass = "Lcom/braze/Braze;",
    name = "logCustomEvent",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;", "Lcom/braze/models/outgoing/BrazeProperties;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object BrazeCustomEventHelperLikeFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/braze/BrazeCustomEventHelper;",
    name = "possiblyLikedFirstSong",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("Landroid/content/Context;", "Ljava/lang/String;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object BrazeCustomEventHelperPlaylistFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/braze/BrazeCustomEventHelper;",
    name = "possiblySendCreateFirstPlaylistEvent",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("Landroid/content/Context;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object StatsUtilsSendRegisterActionFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/reporting/registeraction/StatsUtils;",
    name = "sendRegisterActionStats",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Lcom/anghami/ghost/objectbox/models/records/StatisticsRecord;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object StatsUtilsStartActionSaveFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/reporting/registeraction/StatsUtils;",
    name = "startActionSave",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object BannerDisplaysReportWorkerFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/app/reporting/banner/BannerDisplaysReportWorker;",
    name = "start",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = emptyList(),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object BannerClicksReportWorkerFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/app/reporting/banner/BannerClicksReportWorker;",
    name = "start",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = emptyList(),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object FirebaseAnalyticsLogEventFingerprint : Fingerprint(
    definingClass = "Lcom/google/firebase/analytics/FirebaseAnalytics;",
    name = "logEvent",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;", "Landroid/os/Bundle;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object SongSendShareAnalyticsFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/pojo/Song;",
    name = "sendShareAnalyticsEventLegacy",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)

object PlaylistSendShareAnalyticsFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/pojo/Playlist;",
    name = "sendShareAnalyticsEventLegacy",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;"),
    filters = listOf(
        opcode(Opcode.RETURN_VOID),
    )
)
