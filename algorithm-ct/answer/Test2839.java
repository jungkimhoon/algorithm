package answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2839 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static int[] sugarBag = {3, 5};

    public static void main(String[] args) throws IOException {
        new Test2839().solve();
    }


    public void solve() throws IOException {
        String str = br.readLine();
        int n = Integer.parseInt(str);
        int ret = -1;

        for (int i = 0; i <= n / sugarBag[1]; i++) {
            int a = i * sugarBag[1];

            for (int j = 0; j <= n / sugarBag[0]; j++) {
                int b = j * sugarBag[0];

                if (a + b == n) {
                    ret = i + j;
                    break;
                }
            }
        }

        System.out.println(ret);
    }
}
