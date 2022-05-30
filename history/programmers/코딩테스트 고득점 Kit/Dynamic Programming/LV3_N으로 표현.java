class Solution {
    static int answer = -1; 
    public int solution(int N, int number) {
              
        dfs(N, number, 0, 0);        
        return answer;
    }
    
    public void dfs(int N, int number, int count, int prev){
        int  temp = N;
        
        if(count > 8){
            answer = -1;
            return;
        }
        
        if(number == prev){
            if(answer == -1 || answer > count)
                answer = count;
            return;
        }
        
        for(int i=0; i<8-count; i++){
            dfs(N, number, count+i+1, prev-temp);
            dfs(N, number, count+i+1, prev+temp);
            dfs(N, number, count+i+1, prev*temp);
            dfs(N, number, count+i+1, prev/temp);
            
            temp = temp * 10 + temp;
        }
    }
}