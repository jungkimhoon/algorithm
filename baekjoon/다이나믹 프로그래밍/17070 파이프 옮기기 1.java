import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(1, 2, 0);
        System.out.println(ans);

    }

    //direction 0:가로 && 1:세로 && 2:대각선
    private static void DFS(int x, int y, int direction) {
        if(x == n && y == n){
            ans++;
            return;
        }

        switch (direction) {
            case 0:
                if(y+1 <= n && arr[x][y+1] == 0){
                    DFS(x, y+1, 0);
                }
                break;

            case 1:
                if(x+1 <=n && arr[x+1][y] == 0){
                    DFS(x+1, y, 1);
                }
                break;

            case 2:
                if(y+1 <= n && arr[x][y+1] == 0){
                    DFS(x, y+1, 0);
                }
                if(x+1 <=n && arr[x+1][y] == 0){
                    DFS(x+1, y, 1);
                }
                break;
        }

        if(x+1 <= n && y+1<=n && arr[x+1][y] == 0 && arr[x][y+1] == 0 && arr[x+1][y+1] == 0){
            DFS(x+1, y+1, 2);
        }
    }
}