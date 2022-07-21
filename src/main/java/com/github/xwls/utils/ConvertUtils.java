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

    /**
     * String 转换为 double
     *
     * @param s            字符串
     * @param defaultValue 默认值
     * @return 转换好的double，如果转换出现异常，会返回默认值
     */
    public static double parseDoubleDefault(String s, double defaultValue) {
        if (s == null) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }


}
