package com.jiker.keju.taxicost;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileRead {
    public List<TaxiTotal> getDataFromFril(String path) throws IOException {
        List<TaxiTotal> taxiTotals = new ArrayList<TaxiTotal>();
        List<String> texts = readFile(path);
        for (String text : texts) {
            taxiTotals.add(textToTaxiTotal(text));
        }
        return taxiTotals;
    }

    public List<String> readFile(String path) throws IOException {
        List<String> texts = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(path));
        String line;
        while ((line = in.readLine()) != null) {
            texts.add(line);
        }
        return texts;
    }

    public TaxiTotal textToTaxiTotal(String text) {
        String[] splitText = text.split(",");
        return new TaxiTotal(new BigDecimal(StringTools.getNumberFromText(splitText[0])),
                new BigDecimal(StringTools.getNumberFromText(splitText[1])));
    }

}
