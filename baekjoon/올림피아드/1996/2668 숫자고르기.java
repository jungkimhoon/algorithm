import java.util.*;
import java.io.*;

public class Main {
	static int[] arr;
	static boolean[] visited;
	static int last;
	static ArrayList<Integer> list;
	
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int n = Integer.parseInt(br.readLine());
       arr = new int[n+1];
       visited = new boolean[n+1];
       list = new ArrayList<Integer>();
       
       for(int i=1; i<=n; i++) {
    	   arr[i] = Integer.parseInt(br.readLine());
       }
       
       for(int i=1; i<=n; i++) {
    	   visited[i] = true;
    	   last = i;
    	   dfs(i);
    	   visited[i] = false;
       }
       Collections.sort(list);
       
       System.out.println(list.size());
       for(Integer i : list) {
    	   System.out.println(i);
       }
	}

	private static void dfs(int i) {
		if(!visited[arr[i]]) {
			visited[arr[i]] = true;
			dfs(arr[i]);
			visited[arr[i]] = false;
		}
		
		if(arr[i] == last) {
			list.add(last);
		}
	}
}