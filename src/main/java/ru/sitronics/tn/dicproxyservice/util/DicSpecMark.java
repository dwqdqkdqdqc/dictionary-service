package ru.sitronics.tn.dicproxyservice.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum DicSpecMark {
    WITHOUT_A_FINGERBOARD("Без грифа"),
    COMMON("В общем доступе"),
    FOR_INTERNAL_USE("Для внутреннего использования"),
    COMMERCIAL_SECRET("Коммерческий секрет"),
    CONFIDENTIAL_INFORMATION("Конфиденциальная информация"),
    PARTICULARLY_IMPORTANT("Особенно важно"),
    BANK_SECRECY("Банковская тайна");

    private final String value;

    public static Map<String, String> response() {
        Map<String, String> m = new HashMap<>();
        Arrays.asList(DicSpecMark.values()).forEach(el -> m.put(el.name(), el.getValue()));
        return m;
    }
}
