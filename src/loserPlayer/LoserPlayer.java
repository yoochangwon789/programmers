package loserPlayer;

import java.util.Arrays;

public class LoserPlayer {
    public static void main(String[] args) {

        LoserPlayer loserPlayer = new LoserPlayer();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(loserPlayer.solution(participant, completion));

    }

    public String solution(String[] participant, String[] completion) {

        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        answer = participant[i];
        return answer;
    }
}
