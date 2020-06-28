
import java.io.*;
import java.util.*;

public class Main {
	static char[][] grid;
	static boolean[][] visited;
	static int[] gX = {0,0,1,-1};
	static int[] gY = {1,-1,0,0};
	static Queue<Integer> queue;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n =  Integer.parseInt(br.readLine());
		
		visited = new boolean[n][n];
		grid = new char[n][n];
		queue = new LinkedList<Integer>();
		
		for(int i=0; i<n; i++) {
			char[] str = br.readLine().toCharArray();
			
			for(int j=0; j<n; j++) {				
				grid[i][j] = str[j];
			}
		}
				
		int count = 0;
		int count2 = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					queue.offer(i);
					queue.offer(j);
					count ++;
					
					while(!queue.isEmpty()) {
						int x = queue.poll();
						int y = queue.poll();
						
						for(int k=0; k<4; k++) {
							int nx = x + gX[k];
							int ny = y + gY[k];
							
							if(isRange(nx, ny, n) && !visited[nx][ny] ) {
								if(grid[x][y] == grid[nx][ny]) {
									visited[nx][ny] = true;
									queue.offer(nx);
									queue.offer(ny);
								}
							}
						}
					}
				}
			}
		}
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {				
				if(grid[i][j] == 'R')
					grid[i][j] = 'G';
			}
		}
		
		visited = new boolean[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					queue.offer(i);
					queue.offer(j);
					count2 ++;
					
					while(!queue.isEmpty()) {
						int x = queue.poll();
						int y = queue.poll();
						
						for(int k=0; k<4; k++) {
							int nx = x + gX[k];
							int ny = y + gY[k];
							
							if(isRange(nx, ny, n) && !visited[nx][ny] ) {
								if(grid[x][y] == grid[nx][ny]) {
									visited[nx][ny] = true;
									queue.offer(nx);
									queue.offer(ny);
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count+" "+count2);		
		
	}

	private static boolean isRange(int nx, int ny, int n) {
		if(nx>=0 && nx<n && ny>=0 && ny < n) return true;
		else return false;
	}	
}
