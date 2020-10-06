package notnumber;

import java.util.ArrayList;

public class NotNumber {
    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int[] answer = {};

        for(int i = 0 ; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                temp.add(arr[i]);
            }
        }

        temp.add(arr[arr.length - 1]);

        answer = new int[temp.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
            System.out.print(answer[i]);
        }
    }
}
