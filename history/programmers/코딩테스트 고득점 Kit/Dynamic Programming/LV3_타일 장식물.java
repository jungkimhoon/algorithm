class Solution {
    public long solution(int N) {
        long answer = 0;
        long[] pibo = new long[N];
        pibo[0] = pibo[1] = 1;

        for(int i=2; i<N; i++){
            pibo[i] = pibo[i-1] + pibo[i-2];
        }

        answer = 4*pibo[N-1] + 2*pibo[N-2];
        return answer;
    }   
}