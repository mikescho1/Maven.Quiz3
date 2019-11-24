package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        ArrayList<String> strArrLst = new ArrayList<>();
        str = str.toLowerCase();


        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                strArrLst.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
            }
        }
        String[] arr = new String[strArrLst.size()];
        arr = strArrLst.toArray(arr);
        return arr;
    }
}
