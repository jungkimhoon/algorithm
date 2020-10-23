class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long lw = (long) w;
        long lh = (long) h;
        long square = lw * lh;
        
        long cut = ((lw+lh) - GCD(lw, lh));
        answer = square - cut;            
        
        return answer;
    }
    
    public long GCD(long w, long h){
        if(h == 0){
            return w;
        } else {
            return GCD(h, w%h);
        }
    }
}