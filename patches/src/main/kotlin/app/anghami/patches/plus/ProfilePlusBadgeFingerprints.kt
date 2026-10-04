package app.anghami.patches.plus

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.fieldAccess
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

/**
 * Profile header and account information Plus badge targets (Anghami 8.0.28).
 *
 * Targets:
 * - UserHeaderModel._bind: User profile header avatar and badges.
 * - UserInfo.isPlus: User account model in settings/profile.
 * - SettingsRow$UserInfo.isPlus: Settings list user row model.
 */

object UserHeaderModelBindFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/model/adapter/headers/UserHeaderModel;",
    name = "_bind",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf("Lcom/anghami/model/adapter/headers/UserHeaderViewHolder;"),
    filters = listOf(
        fieldAccess(
            opcode = Opcode.IGET_BOOLEAN,
            definingClass = "Lcom/anghami/ghost/pojo/Profile;",
            name = "isPlus",
            type = "Z",
        ),
    )
)

object UserInfoIsPlusFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/model/pojo/settings/UserInfo;",
    name = "isPlus",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = listOf(),
)

object SettingsRowUserInfoIsPlusFingerprint : Fingerprint(
    definingClass = "Lcom/anghami/model/pojo/settings/SettingsRow\$UserInfo;",
    name = "isPlus",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = listOf(),
)
