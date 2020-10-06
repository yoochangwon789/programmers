package gymsuit;

public class Gymsuit {
    public static void main(String[] args) {

        int n = 5;
        int returnGet = 0;

        int[] lost = {2,4};
        int[] reserve = {3};

        int longLength = (lost.length <= reserve.length) ? lost.length : reserve.length;

        for(int i = 0; i < longLength; i++) {

            if(lost[i] + 1 == reserve[i] || lost[i] - 1 == reserve[i]) {
                returnGet = n;
            }

            if(reserve.length == 1 && lost.length != 1) {

                if(reserve[i] + 1 == lost[i] || reserve[i] - 1 == lost[i]) {
                    n = n - 1;
                    returnGet = n;
                }
                else {
                    n = n - 1;
                    returnGet = n;
                }
            }

            if(reserve.length == 1 && lost.length == 1) {

                if(reserve[i] + 1 == lost[i] || reserve[i] - 1 == lost[i]) {
                    returnGet = n;
                }
                else {
                    n = n - 1;
                    returnGet = n;
                }
            }
        }
        System.out.println(returnGet);
    }
}
