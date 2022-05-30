
import java.io.*;
import java.util.*;

public class Main {		
	static int[][] yard;
	static boolean[][] visited;
	static int[] X = {0,0,1,-1};
	static int[] Y = {1,-1,0,0};
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int count = 0;
			int maxx = sc.nextInt();
			int maxy = sc.nextInt();
			yard = new int[maxx][maxy];
			visited = new boolean[maxx][maxy];
			
			int worm = sc.nextInt();
						
			for(int j=0; j<worm; j++) {
				
				int yardX = sc.nextInt();
				int yardY = sc.nextInt();
				
				yard[yardX][yardY] = 1;				
			}
			
			for(int j=0; j<maxx; j++) {
				for(int k=0; k<maxy; k++) {
					if(!visited[j][k] && yard[j][k] == 1) {
						dfs(j,k,maxx,maxy);
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}

	private static void dfs(int j, int k,int maxx, int maxy) {
		visited[j][k] = true;
		
		for(int i=0; i<4; i++) {
			int nx = j + X[i];
			int ny = k + Y[i];
			
			if(isRange(nx, ny, maxx, maxy) && !visited[nx][ny] && yard[nx][ny] == 1) {
				dfs(nx, ny, maxx, maxy);
			}				
		}		
	}

	private static boolean isRange(int x, int y, int maxx, int maxy) {
		if(x>=0 && x<maxx && y>=0 && y<maxy) return true;
		else return false;
	}	
}