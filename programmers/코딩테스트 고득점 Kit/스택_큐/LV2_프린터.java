import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

       int answer = 0;
        PriorityQueue<Integer> printQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int priority : priorities){
            printQ.offer(priority);
        }

        while(true){
            if(printQ.isEmpty()) break;

            for(int i=0; i<priorities.length; i++){
                if(printQ.peek() == priorities[i]){
                    printQ.poll();
                    answer++;
                    if(i == location){
                        printQ.clear();
                        break;
                    }
                }                
             }            
        }

        return answer;
    }
}
