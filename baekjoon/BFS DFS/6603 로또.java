import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;
    static boolean[] visited;
    static int ans;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            if(n==0) System.exit(0);
            arr = new int[n];
            visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<=n-6; i++) {
                dfs(n, i, 1, arr[i]+" ");
            }
            System.out.println();
        }
    }

    private static void dfs(int n,int idx, int count, String str) {
        if(count == 6){
            System.out.println(str);
            return;
        }

        visited[idx] = true;

        for (int i = idx + 1; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(n, i, count+1, str+arr[i]+" ");
                visited[i] = false;
            }
        }
    }
}