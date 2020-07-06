import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		while(true){
			if(N%5 == 0) {
				count += N/5;
				break;
			}
			
			if(N < 0) {
				count = -1;
				break;
			}
			
			N = N-3;
			count += 1;				
		}
		System.out.println(count);
		
	}
}
