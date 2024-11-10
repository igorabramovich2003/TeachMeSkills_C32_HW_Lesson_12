package com.teachmeskills.lesson_12.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson_12.consts.Constants.URL_REGEXP;
//Task2
public class URLValidator {
    public static String isValidURL(String url) {
        Pattern pattern = Pattern.compile(URL_REGEXP);
        Matcher matcher = pattern.matcher(url);
        return (matcher.find()? "Yes":"No");
    }
}
