package selecttwosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectTwoSum {

    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};

        System.out.println(solution(numbers));
    }

    static public int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();
        int[] answer;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j <= numbers.length; j++) {

                int c = numbers[i] + numbers[j];
                list.add(c);
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {

            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
