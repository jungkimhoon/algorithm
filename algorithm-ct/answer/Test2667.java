import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Test2667 {

    private static boolean[][] visited;
    private static int[] dy = {-1, 0, 1, 0};
    private static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<n; j++) {
                map[i][j] = s.charAt(j)-'0';
            }
        }

        int total = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    int apt = 0;
                    apt = dfs(i,j, visited, n, map, apt);
                    list.add(apt);
                    total++;
                }
            }
        }

        System.out.println(total);
        Collections.sort(list);

        for(Integer i : list) {
            System.out.println(i);
        }
    }


    public static int dfs(int x, int y, boolean[][] visited, int n, int[][] map, int apt) {
        visited[x][y] = true;
        apt++;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<n && ny<n) {
                if(map[nx][ny] == 1 && !visited[nx][ny]) {
                    apt = dfs(nx, ny, visited, n, map, apt);
                }
            }
        }

        return apt;
    }
}
