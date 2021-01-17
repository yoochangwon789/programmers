package twonumberssum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TwoNumbersSumTest {
    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[i - 1] + numbers[i]);
        }
    }
}
