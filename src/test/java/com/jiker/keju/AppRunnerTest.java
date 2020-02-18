package com.jiker.keju;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AppRunnerTest {

    @Test
    public void getStringBuffer() throws IOException {
        String path = "testData.txt";
        String expectedData = "收费6元\n" +
                "收费7元\n" +
                "收费13元\n" +
                "收费7元\n";
        assertEquals(expectedData, AppRunner.getStringBuffer(path).toString());
    }
}
