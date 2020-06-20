import java.util.Arrays;
import java.util.Scanner;

public class Main {		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			dp[i] = 1;
		}
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j] && dp[i] <= dp[j]) {
					dp[i] = dp[j]+1;
				}
			}
		}
		
		Arrays.sort(dp);
		System.out.println(dp[dp.length-1]);
		
	}
}