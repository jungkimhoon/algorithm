import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] survey = new int[n];
		int sum0 = 0;
		int sum1 = 0;
		
		for(int i=0; i<n; i++) {
			survey[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(survey[i] == 0) sum0++;
			if(survey[i] == 1) sum1++;
		}
		
		if(sum0>sum1) System.out.println("Junhee is not cute!");
		else System.out.println("Junhee is cute!");
				
	}
}