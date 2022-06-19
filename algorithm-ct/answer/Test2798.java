package answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test2798 {
    static int n;
    static int m;
    static int[] input;
    static boolean[] visited;
    static int[] card = new int[3];
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        input = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        
        dfs(0);
        System.out.println(result);
    }

    private static void dfs(int count) {
        if(count == 3) {
            int sum = Arrays.stream(card).sum();

            if(sum == m) {
                result = sum;
            } else if (sum < m) {
                result = Math.max(result, sum);
            }

            return;
        }

        for(int i=count; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                card[count] = input[i];
                dfs(count + 1);
                visited[i] = false;
            }
        }
    }
}
