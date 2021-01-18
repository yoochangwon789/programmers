package kakaodalldraw;

import java.util.ArrayList;

public class TestCode {
    public static void main(String[] args) {

        int[][] a = {{0,0,0,4,3}, {0,0,0,4,3}};
        int[] b = {0,0,0,4,3};
        int topp = 0;

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            if (b[i] == 0) {
                topp++;
            }
        }
        integerArrayList.add(b[topp]);
        topp = 0;
        System.out.println(integerArrayList + ", " + topp);
    }
}
