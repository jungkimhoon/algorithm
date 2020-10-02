import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int left = 0;
        int right = num - 1;
        long answer = 0;
        // -

        for(; left<right; left+=2){
            if(arr[left] < 1 && arr[left+1] < 1){
                answer += arr[left] * arr[left+1];
            }else{
                break;
            }
        }

        for (; right > 0; right -= 2) {
            if (arr[right] > 1 && arr[right - 1] > 1) {
                answer += arr[right] * arr[right - 1];
            } else {
                break;
            }
        }

        for(; right >= left; right--){
            answer += arr[right];
        }

        System.out.println(answer);
    }
}