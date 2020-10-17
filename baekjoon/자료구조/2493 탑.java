import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Stack<int[]> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= num; i++) {
            int v = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                if(stack.peek()[1] >= v){
                    sb.append(stack.peek()[0] + " ");
                    break;
            }
            stack.pop();
            }
            if(stack.isEmpty()){
                sb.append("0 ");
            }
            stack.push(new int[] {i, v});
        }
        System.out.println(sb.toString());
    }
}