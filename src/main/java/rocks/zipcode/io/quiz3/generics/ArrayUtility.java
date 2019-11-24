package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public <T> SomeType findOddOccurringValue() {
        SomeType value = null;
        for(int i = 0; i < array.length; i++) {
            if(getNumberOfOccurrences(array[i]) % 2 == 1)  {
                value = array[i];
            } ;
        }   return value;

    }





    public SomeType findEvenOccurringValue() {
        return Arrays.stream(array).filter(s -> getNumberOfOccurrences(s) % 2 == 0).findAny().get();
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return (int)Arrays.stream(array).filter(i -> i.equals(valueToEvaluate)).count();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Stream.of(array).filter(predicate::apply).toArray(size -> Arrays.copyOf(array, size));

    }
}