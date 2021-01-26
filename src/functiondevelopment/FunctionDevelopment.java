package functiondevelopment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FunctionDevelopment {
    public static void main(String[] args) {

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] a = new int[solution(progresses, speeds).length];

        for (int i = 0; i < a.length; i++) {
            a[i] = solution(progresses, speeds)[i];
            System.out.println(a[i]);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Stack<Integer> integerStack = new Stack<>();

        for (int i = progresses.length - 1; i >= 0; i--)
            integerStack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));

        List<Integer> integerList = new ArrayList<>();

        while (!integerStack.isEmpty()) {
            int cnt = 1;
            int top = integerStack.pop();

            while (!integerStack.isEmpty() && integerStack.peek() <= top) {
                cnt++;
                integerStack.pop();
            }

            integerList.add(cnt);
        }

        answer = new int[integerList.size()];

        for (int i = 0 ; i < answer.length; i++) {
            answer[i] = integerList.get(i);
        }

        return answer;
    }
}
