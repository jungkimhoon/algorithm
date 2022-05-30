import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String[] arr;
    static int L;
    static int C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        L = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);

        arr = br.readLine().split(" ");        
        Arrays.sort(arr);
        
        solve(0, "");
    }

    private static void solve(int idx, String str) {
        if(str.length() == L){
            if(isChecked(str)){
                System.out.println(str);
            }
            return;
        }
        if(idx >= C){
            return;
        }

        solve(idx+1, str+arr[idx]);
        solve(idx+1, str);
    }



    private static boolean isChecked(String str) {
        int son = 0;
        int mother = 0;
        for (int i = 0; i < str.length(); i++) {
            if(isMother(str.charAt(i))){
                mother++;
            }else{
                son++;
            }
        }
        if(son >= 2 && mother >= 1){
            return true;
        }else{
            return false;
        }

    }

    private static boolean isMother(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else
            return false;
    }
}