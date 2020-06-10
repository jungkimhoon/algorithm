import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>(); 
		HashMap<Integer, Integer> has = new HashMap<>();
		
		int n = sc.nextInt();
		boolean[][] visited = new boolean[n][n];
		int[][] map = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String input = sc.next();
			for(int j=0; j<n; j++) {
				map[i][j] = input.charAt(j) - '0'; 			
			}
		}
		
		int mark = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 0 || visited[i][j]) continue;
				
				visited[i][j] = true;
				q.add(i);
				q.add(j);
				mark++;
				if(has.get(mark) != null)	has.put(mark, has.get(mark)+1);
				else has.put(mark, 1);
			
				
				while(!q.isEmpty()) {
					int x = q.poll();
					int y = q.poll();
					
					for(int k=0; k<4; k++) {
						int nx = x + dx[k];
						int ny = y + dy[k];
						
						if(!isRange(nx, ny, n) || visited[nx][ny] || map[nx][ny] == 0)
							continue;
						
						visited[nx][ny] = true;
						
						if(has.get(mark) != null) has.put(mark, has.get(mark)+1);
						else has.put(mark, 1);
						q.add(nx);
						q.add(ny);
												
					}
				}
			}
		}
		System.out.println(mark);	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(Integer i : has.keySet()) {
			list.add(has.get(i));
		}
		
		Collections.sort(list);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}
	
	static boolean isRange(int x, int y, int n) {
		if( x<0 || x>=n || y<0 || y>=n) return false;
		return true;
		
	}
	
}