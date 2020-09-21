import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;

    static int[] nx = {1, 0, -1, 0};
    static int[] ny = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(map[i][j], max);
            }
        }

        int max_cnt = 1;

        for(int i=1; i<max; i++) {
            visited = new boolean[n][n];
            int count = 0;
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(map[j][k] > i && visited[j][k] == false) {
                        count ++;
                        dfs(j, k, i);
                    }
                }
            }
            max_cnt = Math.max(max_cnt, count);
        }

        System.out.println(max_cnt);
    }

    public static void dfs(int x, int y, int h) {

        if(x<0 || x>=n || y<0 || y>=n)
            return;

        if(visited[x][y] || map[x][y] <= h)
            return;

        visited[x][y] = true;

        for(int i=0; i<4; i++) {
            int nextX = x + nx[i];
            int nextY = y + ny[i];

            if(nextX>=0 && nextY>=0 && nextX<n && nextY<n) {
                if(map[nextX][nextY] > h && visited[nextX][nextY] == false)
                    dfs(nextX, nextY, h);
            }
        }
    }
}