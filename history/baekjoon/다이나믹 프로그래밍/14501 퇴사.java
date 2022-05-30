import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int num = Integer.parseInt(br.readLine());
		int[] t = new int[num+10];
		int[] p = new int[num+10];
		int[] dp = new int[num+10];
		int max = 0;
		
		for(int i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=num+1; i++) {
			dp[i] = Math.max(dp[i], max);
			dp[t[i]+i] = Math.max(dp[t[i]+i], p[i]+dp[i]);
			max = Math.max(max, dp[i]);
						
		}
		
		System.out.println(max);	
		
	}
}
