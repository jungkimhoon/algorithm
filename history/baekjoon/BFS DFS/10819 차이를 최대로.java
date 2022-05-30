import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;
    static int[] nArr;
    static boolean[] visited;
    static int answer;
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        num = Integer.parseInt(br.readLine());
        arr = new int[num];
        nArr = new int[num];
        visited = new boolean[num];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(answer);
    }

    private static void dfs(int idx) {
        if(idx == num){
            int sum = 0;
            for (int i = 0; i < num-1; i++) {
                sum += Math.abs(nArr[i] - nArr[i+1]);
            }
            answer = Math.max(sum, answer);
            return;
        }

        for (int i = 0; i < num; i++) {
            if(visited[i] == true) continue;
            visited[i] = true;
            nArr[idx] = arr[i];
            dfs(idx+1);
            visited[i] = false;
        }
    }
}