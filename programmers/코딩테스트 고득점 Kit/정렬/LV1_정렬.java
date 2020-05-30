import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        PriorityQueue<Integer> arrayQ = new PriorityQueue<>();
        
        
        for(int i=0; i<commands.length; i++){        
            int start = commands[i][0];
            int last = commands[i][1]; 
            int k = commands[i][2];
            int count = 0;
            
            for(int j=start-1; j<=last-1; j++){
                arrayQ.offer(array[j]);
            }
            
            for(int n=0; n<last-start+1; n++){
                count++;
                if(count == k) answer[i] = arrayQ.poll();
                else arrayQ.poll();     
            }
            
            arrayQ.clear();            
        }                        
        return answer;
    }
}