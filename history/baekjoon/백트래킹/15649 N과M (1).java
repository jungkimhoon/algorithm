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
		
		dfs(n, m, 0);
		System.out.println(sb);
	}

	private static void dfs(int n, int m, int d) {
		if(d == m) {
			for(int i=0; i<arr.length; i++) {
				sb.append(arr[i]+" ");				
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[d] = i;
				dfs(n, m, d+1);
				visited[i] = false;
			}
		}
		return;
	}
}