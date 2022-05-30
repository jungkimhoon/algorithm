import java.util.*;
import java.io.*;

public class Main {	
	
	public static int[] map;
	public static int count;
	public static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			map = new int[n+1];
			map[1] = i;
			dfs(map, 1);
		}
		
		System.out.println(count);
	}

	private static void dfs(int[] map, int col) {
		if(col == n) {
			count++;
			return;
		}
		
		for(int i=1; i<=n; i++) {
			map[col+1] = i;
			if(check(map, col+1)) {
				dfs(map, col+1);
			}
		}		
	}

	private static boolean check(int[] map, int col) {
		for(int i=1; i<col; i++) {
			if(map[i] == map[col])
				return false;
			if(Math.abs(i - col) == Math.abs(map[i] - map[col]))
				return false;
		}
		return true;
	}
}
