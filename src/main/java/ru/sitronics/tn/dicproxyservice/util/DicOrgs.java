package ru.sitronics.tn.dicproxyservice.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum DicOrgs {
    Contractor_1("Организация 1"),
    Contractor_2("Организация 2"),
    Contractor_3("Организация 3"),
    Contractor_4("Организация 4"),
    Contractor_5("Организация 5"),
    Contractor_6("Организация 6"),
    Contractor_7("Организация 7"),
    Contractor_8("Организация 8");

    private final String value;

    public static Map<String, String> response() {
        Map<String, String> m = new HashMap<>();
        Arrays.asList(DicOrgs.values()).forEach(el -> m.put(el.name(), el.getValue()));
        return m;
    }
}
