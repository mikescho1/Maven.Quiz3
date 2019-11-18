package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        String str2 = "";
        char[] charArray = str.toCharArray();
        int count = 0;
        List strArrLst = new ArrayList<>(str.length());
        for (int i = 0; i < strArrLst.size(); i++) {
            strArrLst.add(str);
        }
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (!Character.isWhitespace(charArray[j]) && i == j) {
                    charArray[j] = Character.toUpperCase(charArray[j]);
                }
                if (!Character.isWhitespace(charArray[j]) && i != j) {
                    charArray[j] = charArray[j];
                }
            }


        }   return null;
    }
}
