class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[computers.length];
        for(int i = 0; i < computers.length; i++){
            if(visit[i] == false){
                answer++;
                dfs(i, visit,computers);
            }
        }
        return answer;
    }

    private void dfs(int index, boolean[] visit, int[][] computers){
        visit[index] = true;
        for(int i = 0; i < computers.length; i++){
            if(visit[i] == false && computers[index][i] == 1){
                dfs(i, visit, computers);
            }
        }
    }
}