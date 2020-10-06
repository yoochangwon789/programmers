package middlenumber;

public class MiddleNumber {
    public static void main(String[] args) {

        String s = "abcdefghik";
        String answer = "";
        int index = 0;

        if(s.length() % 2 == 1) {
            index = (s.length() / 2);
            answer += s.charAt(index);
        }
        else {
            index = (s.length() / 2);
            answer += s.substring(index-1, index+1);
        }

        System.out.println(answer);
    }
}
