import java.util.*;
import java.io.*;

public class Main {		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		
		for(int i=1; i<n; i++) {
			if(dp[i-1] >= 0)
			dp[i] = dp[i-1] + arr[i];
			else dp[i] = arr[i];					
		}
		
		Arrays.sort(dp);
		System.out.println(dp[dp.length-1]);		
	}
}
