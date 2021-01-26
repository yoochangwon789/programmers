package functiondevelopment;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopmentTest {
    public static void main(String[] args) {

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        List<Integer> answerList = new ArrayList<>();
        List<Integer> integerList1 = new ArrayList<>();

        int cnt = 0;

        for (int i = 0; i < progresses.length; i++) {

            while (true) {
                progresses[i] += speeds[i];
                cnt++;

                if (progresses[i] >= 100) {
                    integerList1.add(cnt);
                    break;
                }
            }
            cnt = 0;
        }

        int top = 1;

        while (true) {
            int j = integerList1.get(0);

            integerList1.remove(0);

            if (integerList1.size() == 0) {
                break;
            }

            if (j >= integerList1.get(0)) {
                top++;

                if (integerList1.size() == 1) {
                    answerList.add(top);
                }
            }

            if (j < integerList1.get(0)) {
                answerList.add(top);
                top = 1;

                if (integerList1.size() == 1) {
                    top = 1;
                    answerList.add(top);
                }
            }

        }
        System.out.println(answerList);
    }
}
