package rocks.zipcode.io.quiz3.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] charArray = str.toCharArray();
        char a = Character.toUpperCase(charArray[indexToCapitalize]);
        charArray[indexToCapitalize] = a;
        String str2 = new String(charArray);

        return str2;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        return baseString.indexOf(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {

        ArrayList<String> substrings = new ArrayList();
        int count = 0;
        String sub;
        int i, c, length;
        length = string.length();
        for (c = 0; c < length; c++) {
            for (i = 1; i <= length - c; i++) {
                sub = string.substring(c, c + i);
                substrings.add(sub);
                count++;
            }
        }
        String[] arr = new String[count];
        for ( i = 0; i < substrings.size(); i++)
            arr[i] = substrings.get(i);
        return arr;
    }

    public static Integer getNumberOfSubStrings(String input) {
        return null;
    }
}
