package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    public static Boolean hasVowels(String word) {

        return Pattern.compile("[aeiou]").matcher(word).find();

    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return null;
    }

    public static Boolean isVowel(Character character) {
        return null;
    }
}
