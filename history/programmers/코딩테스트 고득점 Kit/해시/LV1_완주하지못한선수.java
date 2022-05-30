import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hm = new HashMap<>();

        for(String part : participant) {
            if(hm.get(part) == null) {
                hm.put(part, 1);
            }
            else {
                hm.put(part, hm.get(part) + 1);
            }
        }

        for(String comp : completion) {
            hm.put(comp, hm.get(comp) - 1);
        }

        for(String key : hm.keySet()) {
            if(hm.get(key) > 0)
                answer += key;
        }

        return answer;
    }
}
