import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		Dp(dp, n);
		int ans = 1;
		int cur = 0;

		int m = Integer.parseInt(br.readLine());
		for(int i=0; i<m; i++){
			int t = Integer.parseInt(br.readLine());
			ans*=dp[t - cur - 1];
			cur = t;
		}
		ans*=dp[n-cur];
		System.out.print(ans);
	}
	
	private static void Dp(int []dp, int n){
		dp[0] = 1; dp[1] = 1;
		for(int i=2;i<=n;i++) dp[i] = dp[i-1]+dp[i-2];
	}
}