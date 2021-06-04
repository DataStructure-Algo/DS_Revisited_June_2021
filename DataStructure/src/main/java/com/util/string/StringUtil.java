package com.util.string;

public interface StringUtil {
    static boolean isNullOrEmpty(String string) {
        return string == null || string.length() == 0;
    }
}