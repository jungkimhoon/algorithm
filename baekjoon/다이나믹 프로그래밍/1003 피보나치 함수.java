import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[][] dp = new int[41][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		int[] num = new int[t];
		for(int i=0; i<t; i++) {
			num[i] = Integer.parseInt(br.readLine());			
		}
		
		for(int i=0; i<t; i++) {
			for(int j=2; j<=num[i]; j++) {
				dp[j][0] = dp[j-2][0] + dp[j-1][0];
				dp[j][1] = dp[j-2][1] + dp[j-1][1];
			}
			
			System.out.println(dp[num[i]][0] +" "+ dp[num[i]][1]);
		}		
	}
}