import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		
		int[] coin = new int[n];
		for(int i=0; i<coin.length; i++) {
			coin[i] = sc.nextInt();
		}
		
		for(int i=coin.length-1; i>=0; i--) {
			while(true) {
				if(coin[i] > k) break;
				else {
					count += k / coin[i];
					k = k % coin[i];
					
				}
			}
		}
		
		System.out.println(count);
	}
}