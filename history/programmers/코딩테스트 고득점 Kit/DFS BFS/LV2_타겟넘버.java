import java.util.*;

class Solution {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        
        dfs(target, numbers, 0);
        return answer;
    }
    
    public void dfs(int target, int[] numbers, int k){
        if(k == numbers.length){
            int sum = 0;
            for(int i=0; i<numbers.length; i++){
                sum += numbers[i];
            }
            if(sum == target)
                answer++;
            return;
            
        }else{
            numbers[k] *= 1;
            dfs(target, numbers, k+1);
            
            numbers[k] *= -1;
            dfs(target, numbers, k+1);
                
                
        }
    }
}