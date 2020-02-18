package com.jiker.keju.taxicost;

import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FileReadTest {

    @Test
    public void getDataFromFrilTest() throws IOException {
        FileRead fileRead = new FileRead();
        String path = System.getProperty("user.dir") + "/src/main/resources/testData.txt";
        List<TaxiTotal> taxiTotals = fileRead.getDataFromFril(path);
        assertEquals(4, taxiTotals.size());
    }

    @Test
    public void readFileTest() throws IOException {
        FileRead fileRead = new FileRead();
        String path = System.getProperty("user.dir") + "/src/main/resources/testData.txt";
        List<String> fileDatas = fileRead.readFile(path);
        assertEquals(4, fileDatas.size());
    }

    @Test
    public void textToTaxiTotalTest() {
        FileRead fileRead = new FileRead();
        TaxiTotal expectedData = new TaxiTotal(BigDecimal.ONE, BigDecimal.ZERO);
        TaxiTotal rtnData = fileRead.textToTaxiTotal("1,0");
        assertEquals(expectedData.getRange(), rtnData.getRange());
        assertEquals(expectedData.getParkTime(), rtnData.getParkTime());
    }
}
