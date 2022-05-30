import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=num1; i<=num2; i++) {
			if(i == 1 ) continue;
			int count = 0;
			for(int j=1; j<=i/2; j++) {
				if(i%j == 0) count++;
				if(count >= 2) break;
			}
			if(count<2) {
				sum += i; 
				min = Math.min(min, i); 
			}
		}
		
		if(sum == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
