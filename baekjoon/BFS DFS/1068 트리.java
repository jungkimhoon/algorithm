import java.util.*;
import java.io.*;

public class Main {
	static int[][] node;
	static boolean[] visited;
	static Queue<Integer> q;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		node = new int[n][n];
		visited = new boolean[n];
		int root = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == -1) {
				root = i;
				continue;
			}
			node[num][i] = node[i][num] = 1;
		}
		
	
		int delete = Integer.parseInt(br.readLine());
		if(n==1 && delete==0){//단일노드인데 제거할 경우
			System.out.println(0);
			return;
		}
		else if(n==1 && delete != 0){ //단일노드인데 제거 안할 경우
			System.out.println(1);
			return;
		}
		
		for(int i=0; i<n; i++) {
			node[delete][i] = node[i][delete] = 0;
		}
		visited[delete] = true;
		
		
		q = new LinkedList<Integer>();
		if(!visited[root]) {
			dfs(root, n);		
		}
		System.out.println(count);
	}

	private static void dfs(int x, int num) {
		boolean flag = true;
		visited[x] = true;
		 for(int i=0; i<num; i++){
	           if(!visited[i] && node[x][i]==1){
	        	   flag = false;
	               dfs(i, num);
	           }
	        }
	        if(flag){
	            count++;
	        }
	}
}