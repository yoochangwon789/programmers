package kakaodalldraw;

import java.util.ArrayList;

public class KakaoDallDrawTest {
    public static void main(String[] args) {

//        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
//        int[] moves = {1,5,3,5,1,2,1,4};
//
//        int[][] arr = new int[board.length][board.length];
//        int top = 0;
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        int cnt = 0;
//
//        for (int i = 0; i < moves.length; i++) {
//            moves[i] = moves[i] - 1;
//        }
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                arr[i][j] = board[j][i];
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int i = 0 ; i < moves.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[moves[i]][j] == 0) {
//                    top++;
//                }
//            }
//            if (top < arr.length) {
//                arrayList.add(arr[moves[i]][top]);
//                arr[moves[i]][top] = 0;
//                top = 0;
//            }
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayList2.add(arrayList.get(i));
//
//            if (arrayList2.size() > 1) {
//                if (arrayList2.get(arrayList2.size() - 2) == arrayList2.get(arrayList2.size() - 1)) {
//                    arrayList2.remove(arrayList2.size() - 2);
//                    arrayList2.remove(arrayList2.size() - 1);
//                    cnt = cnt + 2;
//                }
//            }
//        }
//        System.out.println(cnt);
    }
}
