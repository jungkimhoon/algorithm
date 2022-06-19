package answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1712Bad {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        new Test1712Bad().solve();
    }

    
    public void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int profit = c - b;
        int count = 0;
        int sum = 0;

        if(profit <= 0) {
            System.out.println("-1");
            return ;
        }

        while(true) {
            count ++;
            sum += profit;

            if(sum > a) {
                break;
            }
        }

        System.out.println(count);
    }
}
