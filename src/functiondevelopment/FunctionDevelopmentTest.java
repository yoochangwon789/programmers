package functiondevelopment;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopmentTest {
    public static void main(String[] args) {

        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        List<Integer> answerList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        int cnt = 0;

        for (int i = 0 ; i < progresses.length; i++) {

            while (true) {
                progresses[i] += speeds[i];
                cnt++;

                if (progresses[i] >= 100) {
                    integerList.add(cnt);
                    break;
                }
            }
            cnt = 0;
        }

        int top = 1;

        while (true) {
            int j = integerList.get(0);

            integerList.remove(0);

            if (j < integerList.get(0)) {
                answerList.add(top);
                top = 1;
            } else {
                top++;
            }

            if (j == integerList.get(0)) {
                top++;
            }

            if (integerList.size() == 0) {
                break;
            }
        }

        System.out.println(answerList);
    }
}
