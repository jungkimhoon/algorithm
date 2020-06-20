import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {		
	
	public static void main(String[] args) throws IOException  {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num+1];
		int[] dp = new int[num+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());			
		}
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				dp[i] = Math.max(dp[i], dp[i-j] + arr[j]);
			}
		}
		
		System.out.println(dp[num]);
	}
}