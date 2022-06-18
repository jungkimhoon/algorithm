import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test10819 {
    static int n;
    static int[] arr;
    static int[] resArr;
    static boolean[] visited;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        resArr = new int[n];
        visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);

        System.out.println(result);
    }

    private static void dfs(int count) {
        if(count == n) {
            result = Math.max(getResult(), result);
        }

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                resArr[count] = arr[i];
                dfs(count+1);
                visited[i] = false;
            }
        }       
    }

    public static int getResult(){
        int sum=0;
        for(int i=0; i<n-1; i++){
            sum += Math.abs(resArr[i]-resArr[i+1]);
        }
        return sum;
    }
}
