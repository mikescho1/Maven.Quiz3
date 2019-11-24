package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        List<Integer> inputArList = Arrays.asList(inputArray);
        List<Integer> squaredArList = Arrays.asList(squaredValues);

        Collections.sort(inputArList);
        Collections.sort(squaredArList);

        for(int i = 0; i < inputArList.size(); i++)  {
           if(inputArList.get(i) != Math.sqrt(squaredArList.get(i)))   {
               return false;
            }
        }
        return true;
    }
}
