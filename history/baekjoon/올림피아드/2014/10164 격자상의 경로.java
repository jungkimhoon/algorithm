import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int O = Integer.parseInt(st.nextToken());
		int[][] dp = new int[a+1][b+1];
		int count = 0;
		int oX = 0;
		int oY = 0;
				
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				count++;
				if(count == O) {
					oX = i;
					oY = j;				
					break;
				}
			}
		}				
		
		dp[1][1] = 1;
	
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {				
				if (i == 1 && j == 1) { 
					continue; 
				}

				if ((i > oX && j < oY) || (i < oX && j > oY)) {
					dp[i][j] = 0; 
				} else { 
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; 
				}			
			}
		}		
	
		System.out.println(dp[a][b]);
	}
}