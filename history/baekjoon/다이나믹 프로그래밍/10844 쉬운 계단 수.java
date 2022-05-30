import java.io.*;

public class Main {		
	public static void main(String[] args) throws IOException {
		final int mod = 1000000000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[101][10];
		
		for(int i=1; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				if (j == 0) {
				    dp[i][j] = dp[i-1][1];
				} else if (j == 9) {
				    dp[i][j] = dp[i-1][8];
				} else {
				    dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];					
				}
				dp[i][j] %= mod; 
			}
		}
		
		long sum = 0;
		for(int i=0; i<10; i++) {
			sum += dp[n][i];
		}
		
		System.out.println(sum % mod);
	}
}