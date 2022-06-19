package answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10757 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        new Test10757().solve();
    }

    public void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 = st.nextToken();
        String num2 = st.nextToken();

        int maxLength = Math.max(num1.length(), num2.length());
        int minLength = Math.min(num1.length(), num2.length());

        String str1 = num1.length() > num2.length() ? num1 : num2;
        String str2 = num1.length() <= num2.length() ? num1 : num2;

        int[] aArr = new int[maxLength + 1];
        int[] bArr = new int[maxLength + 1];
        int[] ret = new int[maxLength + 1];

        int counter = 0;
        String str = "";

        for (int i = 0; i < maxLength; i++) {
            aArr[maxLength - i] = str1.charAt(str1.length() - i - 1) - '0';
        }

        for (int i = 0; i < minLength; i++) {
            bArr[maxLength - i] = str2.charAt(str2.length() - i - 1) - '0';
        }

        for (int i = maxLength; i >= 1; i--) {
            counter = aArr[i] + bArr[i] + ret[i] >= 10 ? 1 : 0;
            ret[i] = (ret[i] + aArr[i] + bArr[i]) % 10;
            ret[i-1] += counter;
        }

        for (int i = 1; i <= maxLength; i++) {
            str = str + ret[i];
        }

        if(ret[0] == 1)
            str = "1" + str;

        System.out.println(str);
    }
}
