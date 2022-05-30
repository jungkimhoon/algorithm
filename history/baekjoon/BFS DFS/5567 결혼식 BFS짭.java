import java.util.Scanner;

public class Main {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] friends = new int[n][n];
		boolean[] visited = new boolean[n];
		
		int count = 0;
		
		for(int i=0; i<m; i++) {
			int f1 = sc.nextInt();
			int f2 = sc.nextInt();
			
			friends[f1-1][f2-1] = friends[f2-1][f1-1] = 1;
		}
		
		for(int i=1; i<n; i++) {
			if(friends[0][i] == 1) {
				if(!visited[i]) {
					count++;
					visited[i] = true;
				}
				for(int j=1; j<n; j++) {
					if(friends[i][j] == 1 && !visited[j]) {
						count++;
						visited[j] = true;
					}
						
				}
			}
		}
		
		System.out.println(count);
				
	}
}