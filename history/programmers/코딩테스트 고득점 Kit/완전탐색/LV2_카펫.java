class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
                
        for(int y=3; y <= Math.sqrt(sum); y++){
            if(sum % y == 0){
                int x = sum / y;
                if( (x-2) * (y-2) == yellow){
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }                       
            }
        }        
        
        return answer;
    }
}