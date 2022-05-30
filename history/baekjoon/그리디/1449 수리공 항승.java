
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		int count = 0;
		
		
		int[] location = new int[N];
		
		for(int i=0; i<N; i++) {
			location[i] = sc.nextInt();
		}
		
		Arrays.sort(location);
		
		int tape = location[0] + L - 1 ;
		count++;
		
		for(int i=1; i<N; i++) {
			if(tape < location[i] ) {
				tape = location[i] + L - 1;
				count++;
			}
		}
		
		System.out.println(count);
	}
}
