package com.teachmeskills.lesson_12;

import com.teachmeskills.lesson_12.validator.HexCodeValidator;
import com.teachmeskills.lesson_12.validator.URLValidator;

public class ApplicationRunner {
    public static void main(String[] args) {
        //Task1
        String hexCode = "#8b2323";
        System.out.println(HexCodeValidator.isValidHexCode(hexCode));
        //Task2
        String url = "https://teachmeskills.by/kursy/programmirovaniya-online";
        System.out.println(URLValidator.isValidURL(url));
    }
}
