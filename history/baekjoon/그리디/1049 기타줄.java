import java.util.Scanner;

public class Main { 
		
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] guitar = new int[m][2];
			
		
		for(int i=0; i<guitar.length; i++) {
			guitar[i][0] = sc.nextInt();
			guitar[i][1] = sc.nextInt();
		}
		
		int min1 = guitar[0][1];
		int min = guitar[0][0];
		int div = n/6;
		
		for(int i=0; i<guitar.length; i++) {
			if(guitar[i][0] < min) min = guitar[i][0];
			if(guitar[i][1] < min1) min1 = guitar[i][1];
		}
		
		int result;
		
		if( n <= 6 ) {
			result = min > min1*n ? min1*n : min;
		}else {
			if(min > min1*6) {
				result = min1*n;
			}else {
				result = (div+1)*(min) > div*min + (n%6)*min1 ? div*min + (n%6)*min1 : (div+1)*(min) ;
			}
		}
		System.out.println(result);
	}
}