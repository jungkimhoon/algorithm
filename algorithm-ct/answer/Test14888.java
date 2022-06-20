package answer;

import java.util.*;
import java.io.*;

public class Test14888 {
    static int n;
    static int[] a;
    static int[] op = new int[4];
    static int minResult = Integer.MAX_VALUE;
    static int maxResult = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(1, a[0]);

        System.out.println(maxResult);
        System.out.println(minResult);
    }

    private static void backTracking(int count, int result) {
        if(n == count) {
            minResult = Math.min(result, minResult);
            maxResult = Math.max(result, maxResult);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;
                backTracking(count + 1, operation(i, count, result));
                op[i]++;
            }
        }
    }

    private static int operation(int i, int count, int result) {
        if(i == 0) {
            result += a[count];
        } else if (i == 1) {
            result -= a[count];
        } else if (i == 2) {
            result *= a[count];
        } else if (i == 3) {
            result /= a[count];
        }

        return result;
    }
}

