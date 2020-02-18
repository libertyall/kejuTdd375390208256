package com.jiker.keju;

import com.jiker.keju.taxicost.FileRead;
import com.jiker.keju.taxicost.TaxiTotal;
import com.jiker.keju.taxicost.Taxicost;

import java.io.IOException;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
        StringBuffer receipts = new StringBuffer(0);
        try {
            receipts = getStringBuffer(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String receipt = receipts.toString();
        System.out.println(receipt);
    }

    public static StringBuffer getStringBuffer(String testDataFile) throws IOException {
        FileRead fileRead = new FileRead();
        Taxicost taxicost = new Taxicost();
        List<TaxiTotal> taxiTotals =
                fileRead.getDataFromFril(System.getProperty("user.dir") + "/src/main/resources/" + testDataFile);
        StringBuffer receipts = new StringBuffer();
        for (TaxiTotal taxiTotal : taxiTotals) {
            receipts.append("收费").append(taxicost.calculation(taxiTotal).getTotal()).append("元\n");
        }
        return receipts;
    }
}
