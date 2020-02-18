package com.jiker.keju.taxicost;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTools {

    public static String getNumberFromText(String text) {
        String regEx = "[0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(text);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            sb.append(m.group());
        }
        return sb.toString();
    }
}
