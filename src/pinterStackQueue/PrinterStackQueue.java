package pinterStackQueue;

import java.util.ArrayList;

public class PrinterStackQueue {
    public static void main(String[] args) {

        int[] priorities = {1, 1, 9, 1, 1, 1};
        PrinterStackQueue printerStackQueue = new PrinterStackQueue();

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

            arrayList1.remove(i);

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