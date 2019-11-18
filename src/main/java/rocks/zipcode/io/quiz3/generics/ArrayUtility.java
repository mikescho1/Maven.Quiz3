package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
//        int counter = 0;
//        List<SomeType> oddValues = (int)(Arrays.stream(array).filter(x -> x % 2 == 0));
//
//
//        }
//
//
//        List removedVals = Arrays.stream(array).filter(x -> x == predicate).collect(Collectors.toList());
        return null;
    }

    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Long count = Arrays.stream(array).filter(x ->x == valueToEvaluate).count();
        return count.intValue();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List removedVals = Arrays.stream(array).filter(x -> x == predicate).collect(Collectors.toList());
        return (SomeType[]) removedVals.toArray(Arrays.copyOf(array,removedVals.size()));
    }
}
