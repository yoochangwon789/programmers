package functiondevelopment;

import java.util.ArrayList;

public class TesterTest {
    public static void main(String[] args) {

        int j = 10;
        int[] answer = {1,1,20,1};
        int count = 1;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            if (j >= answer[i]) {
                count++;
            }
            if (j < answer[i]) {
                arrayList.add(count);
                break;
            }
            count = 1;
        }
        System.out.println(arrayList);
    }
}
