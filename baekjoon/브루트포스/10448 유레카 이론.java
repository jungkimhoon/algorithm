import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int[] t = new int[45];

        for (int i = 0; i < 45; i++) {
            t[i] = i * (i + 1) / 2;
        }

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            int flag = 0;
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    for (int m = 1; m < 45; m++) {
                        if(arr[i] == t[j] + t[k] + t[m]) flag = 1;
                    }
                }
            }
            System.out.println(flag);
        }
    }
}