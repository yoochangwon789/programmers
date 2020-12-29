package secretmap;

import java.util.ArrayList;

public class SecretMap {
    public static void main(String[] args) {

        SecretMap secretMap = new SecretMap();

        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {9, 20, 28, 18, 11};

        String[] answer = secretMap.solution(5, arr1, arr2);

        for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public String[] solution(int a, int[] arr1, int[] arr2) {
        String[] answer = {};

        arr1 = new int[a];
        arr2 = new int[a];

        ArrayList<String> arrayList1 = new ArrayList<>(a);
        ArrayList<String> arrayList2 = new ArrayList<>(a);

        for (int i = 0 ; i < arr1.length; i++) {
            arrayList1.add(Integer.toBinaryString(arr1[i]));
            arrayList2.add(Integer.toBinaryString(arr2[i]));
        }

        answer = new String[arrayList1.size()];

        for (int i = 0; i < arrayList1.size(); i++) {
            answer[i] = arrayList1.get(i);
        }

        return answer;
    }
}
