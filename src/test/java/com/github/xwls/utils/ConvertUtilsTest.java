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

}
