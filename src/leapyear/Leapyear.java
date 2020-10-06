package leapyear;

public class Leapyear {
    public static void main(String[] args) {

        int a = 5;
        int b = 24;

        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String[] year = new String[366];
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int wantDay = 0;

        String answer = "";

        for(int i = 0; i < year.length; i++) {

            if(month[a-1] >= b && a <= 12) {
                year[i] = day[(i + 5) % 7];
            }
        }

        for(int i = 0; i < a - 1; i++) {
            wantDay += month[i];
        }

        wantDay += b - 1;
        answer = year[wantDay];
        System.out.println(answer);
    }

}

