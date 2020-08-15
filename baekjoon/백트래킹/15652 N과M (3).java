import java.util.*;
import java.io.*;

public class Main {	
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visited = new boolean[n+1];
		
		dfs(n, m, 0, 1);
		System.out.println(sb);
	}

	private static void dfs(int n, int m, int depth, int k) {
		if(depth == m) {
			for(int i : arr) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;			
		}
		
		for(int i=k; i<=n; i++) {			
				arr[depth] = i;
				dfs(n, m, depth+1, i);			
		}		
	}	
}