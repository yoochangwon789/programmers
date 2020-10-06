package practicetest;

import java.util.ArrayList;

public class PracticeTest {
    public static void main(String[] args) {

        int[] s1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answer = {};
        int[] answers = {1,2,3,4,5};

        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        for(int i = 0; i < answers.length; i++) {
            if(s1[i] == answers[i]) {
                answer1++;
            }

            if(s2[i] == answers[i]) {
                answer2++;
            }

            if(s3[i] == answers[i]) {
                answer3++;
            }
        }

        int max = Math.max(answer1,Math.max(answer2,answer3));
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(max == answer1) list.add(1);
        if(max == answer2) list.add(2);
        if(max == answer3) list.add(3);

        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
            System.out.print(answer[i]);
        }

        System.out.println();
        int abc = 5 % 5;
        System.out.println(abc);
    }
}
