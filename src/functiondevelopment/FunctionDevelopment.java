package functiondevelopment;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopment {
    public static void main(String[] args) {

    }

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answerList1 = new ArrayList<>();
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
                    answerList1.add(top);
                }
            }

            if (j < integerList1.get(0)) {
                answerList1.add(top);
                top = 1;

                if (integerList1.size() == 1) {
                    top = 1;
                    answerList1.add(top);
                }
            }

        }

        return answerList1;
    }
}
