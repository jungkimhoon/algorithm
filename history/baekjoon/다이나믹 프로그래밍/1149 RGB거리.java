import java.util.Scanner;

public class Main {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] rgb = new int[n][3];
		int[][] dp = new int[n][3];
		
		for(int i=0; i<rgb.length; i++) {
			for(int j=0; j<3; j++) {
				rgb[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		int min = 0;
		dp[0][0] = rgb[0][0];
		dp[0][1] = rgb[0][1];
		dp[0][2] = rgb[0][2];
		
		for(int i=1; i<rgb.length; i++) {
			dp[i][0] = (dp[i-1][1] > dp[i-1][2] ? dp[i-1][2] : dp[i-1][1]) + rgb[i][0];
			dp[i][1] = (dp[i-1][0] > dp[i-1][2] ? dp[i-1][2] : dp[i-1][0]) + rgb[i][1];
			dp[i][2] = (dp[i-1][1] > dp[i-1][0] ? dp[i-1][0] : dp[i-1][1]) + rgb[i][2];			
		}
		
		min = dp[dp.length-1][0];
		
		for(int i=1; i<3; i++) {
			if(min > dp[dp.length-1][i]) min = dp[dp.length-1][i];
		}
		
		System.out.println(min);
	}
}