package pinterStackQueue;

import java.util.ArrayList;

public class PrinterStackQueue {
    public static void main(String[] args) {

        ArrayList<Integer> prioritiesList = new ArrayList<>();

        prioritiesList.add(2);
        prioritiesList.add(1);
        prioritiesList.add(3);
        prioritiesList.add(2);

        for(int i = 0; i < prioritiesList.size(); i++) {
            for(int j = 1; j < prioritiesList.size(); j++) {

                if(prioritiesList.get(0) < prioritiesList.get(j)) {
                    prioritiesList.add(prioritiesList.get(0));
                    prioritiesList.remove(0);
                }
            }
        }

        System.out.println(prioritiesList.size());
    }
}
