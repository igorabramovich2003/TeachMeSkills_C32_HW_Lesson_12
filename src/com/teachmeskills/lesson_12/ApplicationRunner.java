package com.teachmeskills.lesson_12;

import com.teachmeskills.lesson_12.validator.HexCodeValidator;
import com.teachmeskills.lesson_12.validator.URLValidator;
/*
Task 1
Write a program that the passed string is a hex code for a color description.
For example, when entering the value #8b2323 into the program, the program should return - Yes.

Task 2
Write a program that will check that the entered link is valid.
For example, when analyzing a link like this https://teachmeskills.by/kursy/programmirovaniya-online - the program should return that the link is valid.
and when entering tcp://teachmeskills.by/kursy/programmirovaniya-online - the program should return that the link is not valid (the link starts with neither http nor https)
 */
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
