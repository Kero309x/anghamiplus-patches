package app.anghami.patches.plus

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.opcode
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

/**
 * Fingerprints for disabling sponsored promotions in Car Mode, search sections, and radar.
 *
 * Target: Anghami 8.0.28
 */

object PreferenceCarModeSponsorFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/prefs/PreferenceHelper;",
    name = "getShowCarModeSponsor",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(
        opcode(Opcode.RETURN),
    )
)

object SectionInfoSponsoredFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/pojo/section/SectionInfo;",
    name = "getSponsored",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(
        opcode(Opcode.RETURN),
    )
)

object SongSponsoredFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/proto/ProtoModels\$Song;",
    name = "getSponsored",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(
        opcode(Opcode.RETURN),
    )
)

object ACRSponsoredTextFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/ghost/prefs/PreferenceHelper;",
    name = "getACRSponsoredText",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Ljava/lang/String;",
    parameters = emptyList(),
    filters = listOf(
        opcode(Opcode.RETURN_OBJECT),
    )
)
