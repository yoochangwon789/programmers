package pinterStackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrinterStackQueue {
    public static void main(String[] args) {

        int[] priorities = {7,1,3,2,4,8};
        int location = 5;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            integerList1.add(priorities[i]);
            integerList2.add(i);
        }

        int count = 0;

        while (true) {
            int P = integerList1.get(0);
            int I = integerList2.get(0);

            integerList1.remove(0);
            integerList2.remove(0);

            if (integerList1.size() == 0) {
                answer += count + 1;
                break;
            }

            if (Collections.max(integerList1) > P) {
                integerList1.add(P);
                integerList2.add(I);
            } else {
                count += 1;

                if (location == I) {
                    answer = count;
                    break;
                }
            }
        }

        return answer;
    }
}
