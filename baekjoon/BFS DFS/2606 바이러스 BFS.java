
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	
	static int[][] com;
	static boolean[] visited;
	static Queue<Integer> queue = new LinkedList<Integer>();
	static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		com = new int[n][n];
		visited = new boolean[n];
		
		for(int i=0; i<m; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			com[n1-1][n2-1] = com[n2-1][n1-1] = 1;
		}		
		
		bfs(0, n);
		System.out.println(count);
	}	
	
	public static void bfs(int i, int n) {
		queue.offer(i);
		
		while(!queue.isEmpty()) {			
			int x = queue.poll();
			visited[x] = true;
			
			for(int j=0; j<n; j++) {
				if(!visited[j] && com[x][j] == 1) {
					queue.offer(j);
					visited[j] = true;
					count++;									
				}
			}
		}
	}
}