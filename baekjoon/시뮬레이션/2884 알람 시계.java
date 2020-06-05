import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h==0 && m < 45) {
			h = 23;
			m = 15 + m;
		}else {
		
			int sum = h * 60 + m;
			sum -= 45;
			
			h = sum / 60;
			m = sum % 60;
		}
		
		System.out.println(h+" "+m);
	}
}