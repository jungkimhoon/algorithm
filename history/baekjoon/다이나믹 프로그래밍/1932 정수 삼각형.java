import java.util.Scanner;

public class Main {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] tri = new int[n][n];
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				tri[i][j] = sc.nextInt();
			}
		}
		
		for(int i=n-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				tri[i][j] += Math.max(tri[i+1][j], tri[i+1][j+1]);
			}
		}
		
		
		System.out.println(tri[0][0]);
		
	}
}