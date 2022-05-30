import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {		
	
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int num = Integer.parseInt(br.readLine());
		int[] card = new int[num+1];
		int[] dp = new int[num+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<num+1; i++) {
			card[i] = Integer.parseInt(st.nextToken());			
		}
		
		for(int i=1; i<=num; i++) {
			dp[i] = card[i];
			for(int j=1; j<=i; j++) {
				dp[i] = Math.min(dp[i-j] + card[j], dp[i]);
			}
		}
		
		System.out.println(dp[num]);
				
	}
}
