import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestA1260 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        
        visited = new boolean[n + 1];

        for(int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);
    }

    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for(int value: graph.get(v)){
            if(!visited[value]) {
                dfs(value);                
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            int value = queue.poll();
            System.out.print(value + " ");

            for(int e : graph.get(value)){
                if(!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                }
            }
        }
        
    }
}
