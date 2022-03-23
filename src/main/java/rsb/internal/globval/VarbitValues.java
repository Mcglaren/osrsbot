package rsb.internal.globval;

import java.util.HashMap;
import java.util.Map;

public enum VarbitValues {
    // Weapon Type
    WEAPON_TYPE_UNARMED(0),
    WEAPON_TYPE_AXE(1),
    WEAPON_TYPE_BLUNT(2),
    WEAPON_TYPE_BOW(3),
    WEAPON_TYPE_CLAW(4),
    WEAPON_TYPE_CROSSBOW(5),
    WEAPON_TYPE_SALAMANDER(6),
    WEAPON_TYPE_CHINCHOMPAS(7),
    WEAPON_TYPE_UNKNOWN_8(8),
    WEAPON_TYPE_SLASH_SWORD(9),
    WEAPON_TYPE_TWO_HANDED_SWORD(10),
    WEAPON_TYPE_PICKAXE(11),
    WEAPON_TYPE_POLEARM(12),
    WEAPON_TYPE_UNKNOWN_13(13),
    WEAPON_TYPE_SCYTHE(14),
    WEAPON_TYPE_SPEAR(15),
    WEAPON_TYPE_SPIKED(16),
    WEAPON_TYPE_STAB_SWORD(17),
    WEAPON_TYPE_STAFF(18),
    WEAPON_TYPE_THROWN(19),
    WEAPON_TYPE_WHIP(20),
    WEAPON_TYPE_BLADED_STAFF(21),
    WEAPON_TYPE_UNKNOWN_22(22),
    WEAPON_TYPE_POWERED_STAFF(23),
    WEAPON_TYPE_BANNER(24),
    WEAPON_TYPE_UNKNOWN_25(25),
    WEAPON_TYPE_BLUDGEON(26),
    WEAPON_TYPE_BULWARK(27),
    // Defensive Autocast
    DEFENSIVE_AUTOCAST_DISABLED(0),
    DEFENSIVE_AUTOCAST_ENABLED(1),
    // Quick Prayer
    QUICK_PRAYER_DISABLED(0),
    QUICK_PRAYER_ENABLED(1),
    // Current Bank Tab
    CURRENT_BANK_TAB_FIRST(0),
    CURRENT_BANK_TAB_SECOND(1),
    CURRENT_BANK_TAB_THIRD(2),
    CURRENT_BANK_TAB_FOURTH(3),
    CURRENT_BANK_TAB_FIFTH(4),
    CURRENT_BANK_TAB_SIXTH(5),
    CURRENT_BANK_TAB_SEVENTH(6),
    CURRENT_BANK_TAB_EIGHT(7),
    CURRENT_BANK_TAB_NINTH(8),
    // XP Drops
    XP_DROPS_HIDDEN(0),
    XP_DROPS_SHOWN(1),
    // Fairy Ring Dial ABCD
    FAIRY_RING_LEFT_DIAL_A(0),
    FAIRY_RING_LEFT_DIAL_B(1),
    FAIRY_RING_LEFT_DIAL_C(2),
    FAIRY_RING_LEFT_DIAL_D(3),
    // Fairy Ring Dial ILJK
    FAIRY_RING_MIDDLE_DIAL_I(0),
    FAIRY_RING_MIDDLE_DIAL_J(1),
    FAIRY_RING_MIDDLE_DIAL_K(2),
    FAIRY_RING_MIDDLE_DIAL_L(3),
    // Fairy Ring Dial PSRQ
    FAIRY_RING_RIGHT_DIAL_P(0),
    FAIRY_RING_RIGHT_DIAL_S(1),
    FAIRY_RING_RIGHT_DIAL_R(2),
    FAIRY_RING_RIGHT_DIAL_Q(3),
    // TODO: FAIRY_RING_LAST_DESTINATION
    // Magic Filter
    MAGIC_FILTER_SHOW_COMBAT_SPELLS_ENABLED(0),
    MAGIC_FILTER_SHOW_COMBAT_SPELLS_DISABLED(1),
    MAGIC_FILTER_SHOW_UTILITY_SPELLS_ENABLED(0),
    MAGIC_FILTER_SHOW_UTILITY_SPELLS_DISABLED(1),
    MAGIC_FILTER_SHOW_NO_LEVEL_SPELLS_ENABLED(0),
    MAGIC_FILTER_SHOW_NO_LEVEL_SPELLS_DISABLED(1),
    MAGIC_FILTER_SHOW_NO_RUNES_SPELLS_ENABLED(0),
    MAGIC_FILTER_SHOW_NO_RUNES_SPELLS_DISABLED(1),
    MAGIC_FILTER_SHOW_TELEPORT_SPELLS_ENABLED(0),
    MAGIC_FILTER_SHOW_TELEPORT_SPELLS_DISABLED(1),
    MAGIC_FILTER_SHOW_LACKING_REQUIREMENTS_SPELLS_ENABLED(0),
    MAGIC_FILTER_SHOW_LACKING_REQUIREMENTS_SPELLS_DISABLED(1),
    // Mouse Wheel Zoom
    MOUSE_WHEEL_ZOOM_ENABLED(0),
    MOUSE_WHEEL_ZOOM_DISABLED(1),
    // Tab Quest Subtabs
    TAB_QUEST_SUBTAB_CHARACTER_SUMMARY(0),
    TAB_QUEST_SUBTAB_QUEST_LIST(1),
    TAB_QUEST_SUBTAB_MINIGAME_GROUP_FINDER(2),
    TAB_QUEST_SUBTAB_ACHIEVEMENT_DIARY(3),
    TAB_QUEST_SUBTAB_KOUREND_FAVOR(4),
    TAB_QUEST_SUBTAB_LEAGUES(5),
    // Tab Settings Subtabs
    TAB_SETTINGS_SUBTAB_CONTROLLS(0),
    TAB_SETTINGS_SUBTAB_AUDIO(1),
    TAB_SETTINGS_SUBTAB_DISPLAY(2),
    // Tab Account Management Subtabs
    TAB_ACC_MANAGEMENT_SUBTAB_ACCOUNT(0),
    TAB_ACC_MANAGEMENT_SUBTAB_COMMUNITY(1),
    TAB_ACC_MANAGEMENT_SUBTAB_LINKS(2),
    // Tab Chat Channel Subtabs
    TAB_CHAT_CHANNEL_SUBTAB_CHAT_CHANNEL(0),
    TAB_CHAT_CHANNEL_SUBTAB_YOUR_CLAN(1),
    TAB_CHAT_CHANNEL_SUBTAB_VIEW_ANOTHER_CLAN(2),
    TAB_CHAT_CHANNEL_SUBTAB_GROUPING(3);

    // cache values on load
    private static final Map<Object, Object> hashMap = new HashMap<>();
    static {
        for (VarbitValues varbitEnum : VarbitValues.values()) {
            hashMap.put(varbitEnum.value, varbitEnum);
        }
    }

    private final int value;

    VarbitValues(int value) {
        this.value = value;
    }

    public static VarbitValues valueOf(int varbitEnum) {
        return (VarbitValues) hashMap.get(varbitEnum);
    }

    public int getValue() {
        return value;
    }
}