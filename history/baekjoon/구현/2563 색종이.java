import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int[][] white = new int[100][100];
		int[][] width = new int[n][2];
		int x; int y;
		for(int i=0; i<width.length; i++) {
			width[i][0] = sc.nextInt();
			width[i][1] = sc.nextInt();
			
			for(int j=width[i][0]; j<width[i][0]+10; j++) {
				for(int k=width[i][1]; k<width[i][1]+10; k++) {
					white[j][k] = 1;
				}
			}
		}
		
		int count = 0;
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(white[i][j] == 1)
					count++;
			}
		}
		
		System.out.println(count);
	}
}