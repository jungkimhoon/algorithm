package answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2941 {
    final static String[] CROATIAN = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        new Test2941().solve();
    }

    public void solve() throws IOException {
        String str = br.readLine();

        for (int i = 0; i < CROATIAN.length; i++) {
            str = str.replaceAll(CROATIAN[i], "t");
        }

        System.out.println(str.length());
    }
}
