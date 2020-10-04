import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int round = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 1;

        while (true) {
            if(a % 2 == 1) a++;
            if(b % 2 == 1) b++;
            if( a == b ) break;

            a /= 2;
            b /= 2;
            count++;
        }

        System.out.println(count);
    }
}