class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for(int i=0; i<s.length(); i++){            
            char c = s.charAt(i);
            if( '0' > c || '9' < c) {
                return false;
            }
            if(s.length() != 4 && s.length() != 6){
                return false;
            }
        }

        return answer;
    }
}