package ru.sitronics.tn.dicproxyservice.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum DicOrgs {
    Org_1("Организация 1"),
    Org_2("Организация 2"),
    Org_3("Организация 3"),
    Org_4("Организация 4"),
    Org_5("Организация 5"),
    Org_6("Организация 6"),
    Org_7("Организация 7"),
    Org_8("Организация 8");

    private final String value;

    public static Map<String, String> response() {
        Map<String, String> m = new HashMap<>();
        Arrays.asList(DicOrgs.values()).forEach(el -> m.put(el.name(), el.getValue()));
        return m;
    }
}
