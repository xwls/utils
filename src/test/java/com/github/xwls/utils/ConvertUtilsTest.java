package com.github.xwls.utils;

import org.junit.Assert;
import org.junit.Test;

public class ConvertUtilsTest {

    @Test
    public void testParseIntDefault() {
        Assert.assertEquals(ConvertUtils.parseIntDefault("10", 0), 10);
        Assert.assertEquals(ConvertUtils.parseIntDefault("", 1), 1);
        Assert.assertEquals(ConvertUtils.parseIntDefault(null, 10), 10);
    }

    @Test
    public void testParseDoubleDefault() {
        Assert.assertTrue(ConvertUtils.parseDoubleDefault("10.5", 0) == 10.5);
        Assert.assertTrue(ConvertUtils.parseDoubleDefault("", 1.2) == 1.2);
        Assert.assertTrue(ConvertUtils.parseDoubleDefault(null, 10.9) == 10.9);
    }

}
