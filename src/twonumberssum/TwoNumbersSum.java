package twonumberssum;

import java.util.ArrayList;
import java.util.Collections;

public class TwoNumbersSum {
    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};

        for (int i : solution(numbers)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                arrayList1.add(numbers[i] + numbers[j]);
            }
        }

        for (int i : arrayList1) {
            if (!arrayList2.contains(i)) {
                arrayList2.add(i);
            }
        }

        Collections.sort(arrayList2);

        answer = new int[arrayList2.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList2.get(i);
        }

        return answer;
   }
}
