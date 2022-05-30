import java.util.*;
import java.io.*;

public class Main {	
	static int num;
	static int count;
	static int[] arr;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {						
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			if(num == 0) break;
			
			arr = new int[num];
			visited = new boolean[num];
			for(int i=0; i<num; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(0,0);
			System.out.println();			
		}
	}
	
	public static void dfs(int start, int depth) {
		if(depth==6) {
			print();
		}
		for(int i=start; i<num; i++) {
			visited[i] = true;
			dfs(i+1, depth+1);
			visited[i] = false;
		}
	}
	
	public static void print() {
		for(int i=0; i<num; i++) {
			if(visited[i])
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}