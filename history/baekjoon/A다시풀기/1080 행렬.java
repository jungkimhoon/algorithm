import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] a = new boolean[n][m];
        boolean[][] b = new boolean[n][m];

        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                if(str.charAt(j)-'0' == 1)
                    a[i][j] = true;
                else
                    a[i][j] = false;
            }
        }

        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                if(str.charAt(j)-'0' == 1)
                    b[i][j] = true;
                else
                    b[i][j] = false;
            }
        }

        int count = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(a[i][j] != b[i][j]) {
                    if(reverseArr(a, b, i, j, n, m)) {
                        count++;
                    } else {
                        System.out.println("-1");
                        return;
                    }
                }
            }
        }

        System.out.println(count);
    }


    public static boolean reverseArr(boolean[][] a, boolean[][] b, int row, int col, int n, int m){

        // 전달받은 인덱스 i, j가 변환할 범위를 벗어날때
        if(row+3 > n || col+3 > m)
            return false;

        for(int i=row; i<row+3; i++) {
            for(int j=col; j<col+3; j++) {
                a[i][j] = !a[i][j];
            }
        }
        return true;
    }
}
