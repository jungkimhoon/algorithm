import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] getIn = new int[4];
		int[] getOut = new int[4];
		
		int max = 0;
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			getOut[i] = sc.nextInt();
			sum -= getOut[i];
			getIn[i] = sc.nextInt();
			sum += getIn[i];
			if(max < sum) max = sum;
		}
		
		System.out.println(max);
			
	}
}