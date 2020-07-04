import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringTokenizer st;
    static List<Integer>[] list;
    static int ans = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        list = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 좌표
            int b = Integer.parseInt(st.nextToken()); // 색깔
            list[b].add(a);
        }
        for(int i = 1; i <= N; i++){
           if(!list[i].isEmpty()){
               Collections.sort(list[i]);
               int size = list[i].size();
               for(int j = 0; j < size; j++){
                   int f = (j == 0) ? 100001 : list[i].get(j) - list[i].get(j - 1);
                   int b = (j == size - 1) ? 100001 : list[i].get(j + 1) - list[i].get(j);
                   ans += Math.min(f, b);
               }
           }
        }
        System.out.print(ans);
    }
}