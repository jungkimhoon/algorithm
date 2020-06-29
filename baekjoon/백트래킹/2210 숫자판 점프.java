import java.util.*;
import java.io.*;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] arr;
	static int N;
	static HashSet<String> list;
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = 5;
		
		list = new HashSet<String>();
		arr = new int[N][N];
		String[] str;
		
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		String s = new String();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				DFS(i, j, 0, s);
			}
		}
		System.out.println(list.size());
	
		
	}

	private static void DFS(int x, int y, int depth, String s) {
		// TODO Auto-generated method stub
		if(depth == 6) {
			list.add(s);
			return;
		}
		
		for(int i=0; i<4; i++) {
			int nextX = dx[i]+x;
			int nextY = dy[i]+y;
			
			if(nextX<0 || nextY<0 || nextX>=N || nextY>=N) {
				continue;
			}
			DFS(nextX,nextY,depth+1,s+arr[x][y]);
		}
		
	}
}
