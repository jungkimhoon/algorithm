import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[][] arr;
    private static int white;
    private static int blue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int num = Integer.parseInt(br.readLine());
        arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divided(0, 0, num);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void divided(int x, int y, int div) {
        if (div == 1) {
            if(arr[x][y] == 1){
                blue++;
            }else{
                white++;
            }
            return;
        }
        boolean flag = true;
        int color = arr[x][y];
        out : for(int i=0; i<div; i++){
            for (int j = 0; j < div; j++) {
                if (arr[x + i][y + j] != color) {
                    flag = false;
                    break out;
                }
            }
        }
        if (flag) {
            if (arr[x][y] == 1) {
                blue++;
            }else {
                white++;
            }
            return;
        }

        int newDiv = div/2;
        divided(x, y, newDiv);
        divided(x + newDiv, y, newDiv);
        divided(x, y + newDiv, newDiv);
        divided(x + newDiv, y + newDiv, newDiv);
    }

}