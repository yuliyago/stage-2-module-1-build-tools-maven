package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try{
                double numb = Double.parseDouble(str);
                if(numb<=0) return false;
        }
        catch(Exception e){
            return false;
        }
        return true;
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
