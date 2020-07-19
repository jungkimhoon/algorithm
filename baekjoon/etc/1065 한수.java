import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(hansu(n));
		
		
	}

	private static int hansu(int n) {
		int count = 0;		
		for(int i=1; i<=n; i++) {
				if(i<100) {
					count++;
				}
				else if(i<1000) {
					int num1 = i%10;
					int num2 = (i/10)%10;
					int num3 = (i/100)%10;
					
					if(num1 - num2 == num2 - num3) {
						count++;
					}
				}
			}		
		return count;
	}
}