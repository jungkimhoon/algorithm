package algorithm;

import java.util.Scanner;

public class Main { 
		
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] kids = new int[num];
		int[] c = new int[num];
		
		for(int i=0; i<num; i++) {
			kids[i] = sc.nextInt();
		}
		
		c[0] = 1;
		for(int i=1; i<num; i++) {
			c[i] = 1;
			for(int j=0; j<i; j++) {
				if(kids[i] > kids[j] && c[i] <= c[j])
					c[i] = c[j] + 1;
			}
		}
		
		int max = 0;

		for(int i=0; i<num; i++) {
			if(c[i] > max)
				max = c[i];
		}
			
		System.out.println(num-max);		
		
	}
}