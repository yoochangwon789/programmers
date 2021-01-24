package pinterStackQueue;

import java.util.ArrayList;

public class PrinterStackQueueTest {
    public static void main(String[] args) {

        int[] priorities = {7,1,3,2,4,8};
        PrinterStackQueueTest printerStackQueue = new PrinterStackQueueTest();

        System.out.println(printerStackQueue.solution(priorities, 2));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        int cnt = 0;

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> locList = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            arrayList1.add(priorities[i]);
            locList.add(i);
        }

        while (true) {
            int i = arrayList1.get(0);
            System.out.println("i : " + i);

            arrayList1.remove(i);
            System.out.println(arrayList1);

            if (arrayList1.get(location) > i) {
                arrayList1.add(i);
            } else {
                answer += cnt + 1;
                break;
            }
        }

        return answer;
    }
}