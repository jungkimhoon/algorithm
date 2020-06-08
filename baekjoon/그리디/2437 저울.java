import java.util.Arrays;
import java.util.Scanner;

public class Main { 
		
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] cal = new int[n];
		
		for(int i=0; i<n; i++) {
			cal[i] = sc.nextInt();			
		}
		
		Arrays.sort(cal);
		
		
		int sum = 1;
		for(int i=0; i<n; i++) {
			if(sum < cal[i])
				break;
			else sum += cal[i];
		}
		
		System.out.println(sum);
		
	}
}