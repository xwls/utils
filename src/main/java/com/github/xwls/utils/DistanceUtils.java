package com.github.xwls.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 根据经纬度计算两点间的距离
 *
 * @author wzw
 */
public final class DistanceUtils {
    /**
     * 地球半径,单位 km
     */
    private static final double EARTH_RADIUS = 6371.393;

    /**
     * 根据经纬度，计算两点间的距离
     *
     * @param longitude1 第一个点的经度
     * @param latitude1  第一个点的纬度
     * @param longitude2 第二个点的经度
     * @param latitude2  第二个点的纬度
     * @return 返回距离 单位千米
     */
    public static double getDistance(double longitude1, double latitude1, double longitude2, double latitude2) {
        // 纬度
        double lat1 = Math.toRadians(latitude1);
        double lat2 = Math.toRadians(latitude2);
        // 经度
        double lng1 = Math.toRadians(longitude1);
        double lng2 = Math.toRadians(longitude2);
        // 纬度之差
        double a = lat1 - lat2;
        // 经度之差
        double b = lng1 - lng2;
        // 计算两点距离的公式
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(b / 2), 2)));
        // 弧长乘地球半径, 返回单位: 千米
        s = s * EARTH_RADIUS;
        return s;
    }

    /**
     * 根据经纬度，计算两点间的距离
     *
     * @param coordinate1 第一个点的经纬度坐标，经度,纬度
     * @param coordinate2 第一个点的经纬度坐标，经度,纬度
     * @return 返回距离 单位千米
     */
    public static double getDistance(String coordinate1, String coordinate2) {
        if (StringUtils.isAnyEmpty(coordinate1, coordinate2)) {
            return 0;
        }
        String[] split1 = coordinate1.split(",");
        String[] split2 = coordinate2.split(",");
        if (split1.length != 2 || split2.length != 2) {
            return 0;
        }
        double longitude1 = Double.parseDouble(split1[0]);
        double latitude1 = Double.parseDouble(split1[1]);
        double longitude2 = Double.parseDouble(split2[0]);
        double latitude2 = Double.parseDouble(split2[1]);
        return getDistance(longitude1, latitude1, longitude2, latitude2);
    }
}
