import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '('){
                    stack.add('(');
                }else{
                    if(!stack.isEmpty()){
                        if(stack.peek() != 'n')
                            stack.pop();
                    }else{
                        stack.add('n');
                    }
                }
            }
            if(!stack.isEmpty()){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}