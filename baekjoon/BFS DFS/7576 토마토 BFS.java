import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {		
	static int[][] map;
	static boolean[][] visited;
	static int[] nx = {0,0,1,-1};
	static int[] ny = {1,-1,0,0};
	static int n;
	static int m;
	static int count;
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					q.offer(i);
					q.offer(j);
				}
			}
		}
		
		bfs();
			
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 0) {
					System.out.println("-1");
					return;
				}
			}
		}
		
		
		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] > max) max = map[i][j];
			}
		}
		System.out.println(max-1);
	}
	
	public static void bfs() {
				
		while(!q.isEmpty()) {
			int x1 = q.poll();
			int y1 = q.poll();
			visited[x1][y1] = true;
			
			for(int i=0; i<4; i++) {
				int X = x1 + nx[i];
				int Y = y1 + ny[i];
				
				if(!isRange(X, Y) || visited[X][Y] || map[X][Y] != 0) continue;
				
				visited[X][Y] = true;
				map[X][Y] = map[x1][y1]+1;
				q.offer(X);
				q.offer(Y);
			}
		}
	}
	
	public static boolean isRange(int x, int y) {
		if(x>=0 && x<n && y>=0 && y<m) return true;
		else return false;
	}
}