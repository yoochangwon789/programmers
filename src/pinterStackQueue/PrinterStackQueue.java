package pinterStackQueue;

import java.util.ArrayList;

public class PrinterStackQueue {
    public static void main(String[] args) {

        ArrayList<Integer> prioritiesList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        prioritiesList.add(2);
        prioritiesList.add(1);
        prioritiesList.add(3);
        prioritiesList.add(2);

        for(int i = 0; i < prioritiesList.size(); i++) {
            if(prioritiesList.get(0) < prioritiesList.get(i + 1)) {
                prioritiesList.remove(prioritiesList.get(0));
            }
        }

        System.out.println(answerList);
    }
}
