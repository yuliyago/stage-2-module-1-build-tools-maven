package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg: args) {
            double numb = Double.parseDouble(arg);
            if(numb<=0) return false;
        }
        return true;
    }
}