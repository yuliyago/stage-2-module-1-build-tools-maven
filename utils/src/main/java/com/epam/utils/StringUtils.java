package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try{
            if(!str.equals("")){
                String substr=str.split("\\.")[0];
                if (Integer.parseInt(substr)==0) return false;
                return org.apache.commons.lang3.StringUtils.isNumeric(substr);
            }
            return false;
        }
       catch (Exception e){
            return false;
       }
    }

    public static void main(String[] args) {
        System.out.println(isPositiveNumber(""));
        System.out.println(isPositiveNumber("-6"));
        System.out.println(isPositiveNumber("0"));
        System.out.println(isPositiveNumber("23"));
        System.out.println(isPositiveNumber("12.2"));
        System.out.println(isPositiveNumber("-9.5"));
    }
}
