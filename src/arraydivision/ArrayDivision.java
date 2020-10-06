package arraydivision;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDivision {
    public static void main(String[] args) {

        int[] arr = {2,36,1,3};
        int divisor = 1;
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
            else {
                answer.add(-1);
                break;
            }
        }

        Collections.sort(answer);
        System.out.println(answer);
    }
}
