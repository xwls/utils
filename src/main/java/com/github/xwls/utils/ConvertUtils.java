package com.github.xwls.utils;

/**
 * 类型转换工具类
 */
public class ConvertUtils {

    /**
     * String 转换为 int
     *
     * @param s            字符串
     * @param defaultValue 默认值
     * @return 转换好的int，如果转换出现异常，会返回默认值
     */
    public static int parseIntDefault(String s, int defaultValue) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public static String hello(String s) {
        return "hello " + s;
    }

}
