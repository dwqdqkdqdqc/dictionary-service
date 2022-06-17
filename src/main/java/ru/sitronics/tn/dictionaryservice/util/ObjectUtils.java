package ru.sitronics.tn.dictionaryservice.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ObjectUtils {
    @SuppressWarnings("unchecked")
    public static <T> T castToAnything(Object obj) {
        return (T) obj;
    }
}
