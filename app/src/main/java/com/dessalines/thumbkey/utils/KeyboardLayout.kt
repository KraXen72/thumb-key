package com.dessalines.thumbkey.utils

import com.dessalines.thumbkey.keyboards.KB_BG_THUMBKEY_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_BY_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_BY_THUMBKEY_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_CA_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_DA_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_DE_MESSAGEEASE
import com.dessalines.thumbkey.keyboards.KB_DE_MESSAGEEASE_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_DE_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_DE_THUMBKEY_MULTILINGUAL
import com.dessalines.thumbkey.keyboards.KB_DE_TYPESPLIT
import com.dessalines.thumbkey.keyboards.KB_ENEO_MESSAGEEASE_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_EN_MESSAGEEASE
import com.dessalines.thumbkey.keyboards.KB_EN_MESSAGEEASE_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY_MULTI
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY_MULTI_CZ
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY_MULTI_EE
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY_MULTI_IT
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY_PROGRAMMER
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY_PROGRAMMER_WIDE
import com.dessalines.thumbkey.keyboards.KB_EN_THUMBKEY_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_EN_TWO_HANDS
import com.dessalines.thumbkey.keyboards.KB_EN_TYPESPLIT
import com.dessalines.thumbkey.keyboards.KB_EOENDE_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_ES_CA_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_ES_EO_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_ES_MESSAGEEASE
import com.dessalines.thumbkey.keyboards.KB_ES_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_ES_TYPESPLIT
import com.dessalines.thumbkey.keyboards.KB_EU_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_FA_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_FI_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_FI_THUMBKEY_WIDE
import com.dessalines.thumbkey.keyboards.KB_FI_TYPESPLIT
import com.dessalines.thumbkey.keyboards.KB_FR_MESSAGEEASE
import com.dessalines.thumbkey.keyboards.KB_FR_THUMBKEY_V1
import com.dessalines.thumbkey.keyboards.KB_FR_THUMBKEY_V2
import com.dessalines.thumbkey.keyboards.KB_FR_TYPESPLIT
import com.dessalines.thumbkey.keyboards.KB_GR_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_HE_MESSAGEEASE
import com.dessalines.thumbkey.keyboards.KB_HE_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_HR_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_HR_THUMBKEY_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_HR_TWO_HANDS
import com.dessalines.thumbkey.keyboards.KB_HU_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_ID_THUMBKEY_SYMBOLS_NUMERIC_V1
import com.dessalines.thumbkey.keyboards.KB_ID_THUMBKEY_SYMBOLS_V1
import com.dessalines.thumbkey.keyboards.KB_ID_THUMBKEY_SYMBOLS_V2
import com.dessalines.thumbkey.keyboards.KB_IT_MESSAGEEASE
import com.dessalines.thumbkey.keyboards.KB_IT_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_IT_TYPESPLIT
import com.dessalines.thumbkey.keyboards.KB_JA_THUMBKEY_HIRAGANA
import com.dessalines.thumbkey.keyboards.KB_JA_THUMBKEY_KATAKANA
import com.dessalines.thumbkey.keyboards.KB_KA_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_LT_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_LV_LTG_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_MATH_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_NL_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_NO_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_PL_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_PL_TYPESPLIT
import com.dessalines.thumbkey.keyboards.KB_PT_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_PT_TYPESPLIT
import com.dessalines.thumbkey.keyboards.KB_RU_MESSAGEEASE
import com.dessalines.thumbkey.keyboards.KB_RU_MESSAGEEASE_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_RU_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_RU_THUMBKEY_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_SK_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_SV_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_T9
import com.dessalines.thumbkey.keyboards.KB_TR_THUMBKEY
import com.dessalines.thumbkey.keyboards.KB_UK_RU_MESSAGEEASE_SYMBOLS
import com.dessalines.thumbkey.keyboards.KB_UK_THUMBKEY

// Make sure new keyboards have a new index, even if they are in the middle
// Keyboards are placed in alphabetical order
enum class KeyboardLayout(val index: Int, val keyboardDefinition: KeyboardDefinition) {
    BGThumbKeySymbols(55, KB_BG_THUMBKEY_SYMBOLS),
    BYThumbKey(19, KB_BY_THUMBKEY),
    BYThumbKeySymbols(20, KB_BY_THUMBKEY_SYMBOLS),
    CAThumbKey(69, KB_CA_THUMBKEY),
    DAThumbKey(3, KB_DA_THUMBKEY),
    DEThumbKey(2, KB_DE_THUMBKEY),
    DEThumbKeyMultiLingual(25, KB_DE_THUMBKEY_MULTILINGUAL),
    DEMessageEase(23, KB_DE_MESSAGEEASE),
    DEMessageEaseSymbols(68, KB_DE_MESSAGEEASE_SYMBOLS),
    DETypeSplit(38, KB_DE_TYPESPLIT),
    ENThumbKey(0, KB_EN_THUMBKEY),
    ENThumbKeySymbols(21, KB_EN_THUMBKEY_SYMBOLS),
    ENThumbKeyProgrammer(1, KB_EN_THUMBKEY_PROGRAMMER),
    ENThumbKeyProgrammerWide(44, KB_EN_THUMBKEY_PROGRAMMER_WIDE),
    ENThumbKeyMulti(48, KB_EN_THUMBKEY_MULTI),
    ENThumbKeyMultiCZ(52, KB_EN_THUMBKEY_MULTI_CZ),
    ENMessageEase(15, KB_EN_MESSAGEEASE),
    ENMessageEaseSymbols(16, KB_EN_MESSAGEEASE_SYMBOLS),
    ENTypeSplit(36, KB_EN_TYPESPLIT),
    ENTwoHands(43, KB_EN_TWO_HANDS),
    ENThumbKeyMultiIT(65, KB_EN_THUMBKEY_MULTI_IT),
    ENEOMessageEaseSymbols(66, KB_ENEO_MESSAGEEASE_SYMBOLS),
    EOENDEThumbKey(50, KB_EOENDE_THUMBKEY),
    ESThumbKey(4, KB_ES_THUMBKEY),
    ESMessageEase(53, KB_ES_MESSAGEEASE),
    ESTypeSplit(37, KB_ES_TYPESPLIT),
    ESCAThumbKey(64, KB_ES_CA_THUMBKEY),
    ESEOThumbKey(46, KB_ES_EO_THUMBKEY),
    EUThumbKey(5, KB_EU_THUMBKEY),
    FAThumbKey(6, KB_FA_THUMBKEY),
    FIThumbKey(7, KB_FI_THUMBKEY),
    FIThumbKeyWide(22, KB_FI_THUMBKEY_WIDE),
    FITypeSplit(59, KB_FI_TYPESPLIT),
    FRThumbKeyV1(8, KB_FR_THUMBKEY_V1),
    FRThumbKeyV2(33, KB_FR_THUMBKEY_V2),
    FRMessageEase(28, KB_FR_MESSAGEEASE),
    FRTypeSplit(39, KB_FR_TYPESPLIT),
    GRThumbKey(51, KB_GR_THUMBKEY),
    HEThumbKey(49, KB_HE_THUMBKEY),
    HEMessageEase(17, KB_HE_MESSAGEEASE),
    HRThumbKey(57, KB_HR_THUMBKEY),
    HRThumbKeySymbols(58, KB_HR_THUMBKEY_SYMBOLS),
    HRTwoHands(56, KB_HR_TWO_HANDS),
    HUThumbKey(45, KB_HU_THUMBKEY),
    IDThumbKeySymbolsV1(27, KB_ID_THUMBKEY_SYMBOLS_V1),
    IDThumbKeySymbolsV2(62, KB_ID_THUMBKEY_SYMBOLS_V2),
    IDThumbKeySymbolsNumeric(63, KB_ID_THUMBKEY_SYMBOLS_NUMERIC_V1),
    ITThumbKey(9, KB_IT_THUMBKEY),
    ITMessageEase(47, KB_IT_MESSAGEEASE),
    ITTypeSplit(40, KB_IT_TYPESPLIT),
    JAThumbKeyHiragana(31, KB_JA_THUMBKEY_HIRAGANA),
    JAThumbKeyKatakana(32, KB_JA_THUMBKEY_KATAKANA),
    KAThumbKey(26, KB_KA_THUMBKEY),
    LTThumbKey(61, KB_LT_THUMBKEY),
    LVLTGThumbKey(60, KB_LV_LTG_THUMBKEY),
    NLThumbKey(10, KB_NL_THUMBKEY),
    NOThumbKey(24, KB_NO_THUMBKEY),
    PLThumbKey(11, KB_PL_THUMBKEY),
    PLTypeSplit(42, KB_PL_TYPESPLIT),
    PTThumbKey(12, KB_PT_THUMBKEY),
    PTTypeSplit(41, KB_PT_TYPESPLIT),
    RUThumbKey(13, KB_RU_THUMBKEY),
    RUThumbKeySymbols(18, KB_RU_THUMBKEY_SYMBOLS),
    RUMessageEase(54, KB_RU_MESSAGEEASE),
    RUMessageEaseSymbols(29, KB_RU_MESSAGEEASE_SYMBOLS),
    SVThumbKey(34, KB_SV_THUMBKEY),
    T9(30, KB_T9),
    TRThumbKey(35, KB_TR_THUMBKEY),
    UKThumbKey(14, KB_UK_THUMBKEY),
    UKRUMessageEaseSymbols(67, KB_UK_RU_MESSAGEEASE_SYMBOLS),
    MATHThumbKey(70, KB_MATH_THUMBKEY),
    ENThumbKeyMultiEE(71, KB_EN_THUMBKEY_MULTI_EE),
    SKThumbKey(72, KB_SK_THUMBKEY),
}
