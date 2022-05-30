import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
				
		int team = 0;
		
		while(true) {			
			if( N<2 || M<1 || N+M <3+K  ) break;
			
			N -= 2;
			M--;
			team++;							
		}
		
		System.out.println(team);
	}
}
