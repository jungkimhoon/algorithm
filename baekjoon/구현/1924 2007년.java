package algorithm;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[] month = new int[12];
		
		int sum = 0;
		
		month[0] = month[2] = month[4] = month[6] = month[7] = month[9] = month[11] = 31;
		month[1] = 28;
		month[3] = month[5] = month[8] = month[10] = 30;
		
		if(x == 1)
			sum = y;
		if(x > 1) {
			for(int i=1; i<x; i++) {
				sum += month[i-1];
			}
			sum += y;
		}
		
		switch(sum % 7) {
		case 1: System.out.println("MON"); break;
		case 2: System.out.println("TUE"); break;
		case 3: System.out.println("WED"); break;
		case 4: System.out.println("THU"); break;
		case 5: System.out.println("FRI"); break;
		case 6: System.out.println("SAT"); break;
		case 0: System.out.println("SUN"); break;
		
		}		
	}
}
