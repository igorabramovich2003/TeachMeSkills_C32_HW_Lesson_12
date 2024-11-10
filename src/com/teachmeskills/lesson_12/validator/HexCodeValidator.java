package com.teachmeskills.lesson_12.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson_12.consts.Constants.HEX_CODE_REGEXP;
//Task1
public class HexCodeValidator{
    public static String isValidHexCode(String hexCode) {
        Pattern pattern = Pattern.compile(HEX_CODE_REGEXP);
        Matcher matcher = pattern.matcher(hexCode);
        return (matcher.find()? "Yes":"No");
    }
}
