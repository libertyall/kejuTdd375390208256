package com.jiker.keju.taxicost;

import com.jiker.keju.AppRunner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToolsTest {

    @Test
    public void getNumberFromText() {
        StringTools tools = new StringTools();
        assertEquals("1", StringTools.getNumberFromText("1公里"));
        assertEquals("0", StringTools.getNumberFromText("等待0分钟"));
        assertEquals("10", StringTools.getNumberFromText("10公里"));
    }
}
