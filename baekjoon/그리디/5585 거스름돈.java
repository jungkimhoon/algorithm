
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int change = 1000 - money;
		int count = 0;
		
		count += change / 500;
		count += change % 500 / 100;
		count += change % 100 / 50;
		count += change % 50 / 10;
		count += change % 10 / 5;
		count += change % 5;
		
		System.out.println(count);
		
		
		
	}
}
