import java.util.*;
import java.io.*;

public class Main {
	static int[][] map;
	static boolean[] visited;
	static Queue<Integer> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[n+1][n+1];
		visited = new boolean[n+1];
		q = new LinkedList<Integer>();		
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[x][y] = map[y][x] = 1;
		}
		
		int count = 0;
		for(int i=1; i<=n; i++) {				
				if(!visited[i]) {
					bfs(i, n);	
					count++;
					continue;
				}				
		}
		
		System.out.println(count);
		
	}

	private static void bfs(int i, int n) {
		q.add(i);
		
		while(!q.isEmpty()) {
			int x = q.poll();			
			for(int j=1; j<=n; j++) {
				if(!visited[j] && map[j][x]==1) {
					visited[j] = true;
					q.add(j);
				}				
			}
		}		
	}
}