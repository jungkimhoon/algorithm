import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static int answer;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        answer = Integer.parseInt(st.nextToken());
        arr = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solve(0, 0);

        if(answer==0) {
            count--;
        }
        System.out.println(count);

    }

    private static void solve(int idx, int result) {
        if(idx == n) {
            if (result == answer) {
                count++;
            }
            return;
        }

        solve(idx + 1, result+arr[idx]);
        solve(idx + 1, result);
    }
}