package pinterStackQueue;

import java.util.ArrayList;

public class PrinterStackQueue {
    public static void main(String[] args) {

        int[] priorities = {1,1,9,1,1,1};
        PrinterStackQueue printerStackQueue = new PrinterStackQueue();

        System.out.println(printerStackQueue.solution(priorities, 0));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        int cnt = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) arrayList.add(priorities[i]);

        while (!arrayList.isEmpty()) {

        }

        return answer;
    }
}
