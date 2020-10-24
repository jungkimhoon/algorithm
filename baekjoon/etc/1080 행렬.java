import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] arr;
    static int[][] ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                ans[i][j] = str.charAt(j) - '0';
            }
        }

        int count = 0;

        for(int i=0; i<n-2; i++){
            for (int j = 0; j < m - 2; j++) {
                if (arr[i][j] != ans[i][j]) {
                    count++;
                    flip(i+1, j+1);
                }
            }
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] != ans[i][j]){
                    flag = false;
                }
            }
        }

        if(flag) System.out.println(count);
        else
            System.out.println(-1);
    }

    public static void flip(int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                arr[i][j] = 1 - arr[i][j];
            }
        }
    }
}