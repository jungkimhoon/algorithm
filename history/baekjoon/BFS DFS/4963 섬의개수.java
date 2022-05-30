import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	static int w, h;
	static int[][] map;
	static boolean[][] visited;
	static Queue<Integer> q = new LinkedList<>();
	static int[] dx = {0, 0, 1, -1, -1,1, 1, -1};
	static int[] dy = {1, -1, 0, 0, 1, 1, -1, -1};
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			
			if(w == 0 && h == 0) break;
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int mark = 0; // 섬 개수
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[i][j] != 1 || visited[i][j]) continue; // 바다이거나 방문 하지 않은 섬들 중
				
					visited[i][j] = true;
					q.add(i);
					q.add(j);
					mark++;
					
					while(!q.isEmpty()) {
						int x = q.poll();
						int y = q.poll();
						
						for(int k=0; k<8; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							
							if(!isRange(nx,ny) || visited[nx][ny] || map[nx][ny] == 0)
								continue; //근처 섬 X|| 방문 || 바다
							
							visited[nx][ny] = true;
							q.add(nx);
							q.add(ny);
						}
					}
				}
			}
			
			System.out.println(mark);
			
		}		
	}
	
	static boolean isRange(int x, int y) {
		if(x<0 || x>=h || y<0 || y>=w) return false;
		return true;
	}
}