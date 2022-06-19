package answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class test11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int divider = 2;

        while (true) {
            if (N % divider == 0) {
                N = N / divider;
                list.add(divider);
            } else {
                divider++;
            }

            if(divider > N) {
                break;
            }
        }
        list.sort(Comparator.naturalOrder());
        for (int i : list) {
            System.out.println(i);
        }
    }
}
