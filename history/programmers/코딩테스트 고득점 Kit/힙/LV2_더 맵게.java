import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> prioQ = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++){
            prioQ.offer(scoville[i]);
        }

        while(true){
            int num = prioQ.poll();
            if(prioQ.size()==0 && num < K) return -1;
            if(num < K){
            num = num + prioQ.poll() * 2;
            prioQ.offer(num);
            answer++;
            }else break;
         }

        return answer;
    }
}