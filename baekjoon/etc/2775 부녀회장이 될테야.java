import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[][] dp = new int[15][15];
		int sum = 0;
		
		for(int i=1; i<15; i++) {
			dp[0][i] = i;
		}		
		
		for(int i=1; i<15; i++) {
			sum = 0;
			for(int j=1; j<15; j++) {
				sum += dp[i-1][j];
				dp[i][j] = sum; 
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			
			System.out.println(dp[x][y]);
		}		
	}
}
