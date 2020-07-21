import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[246913];	
		
		while(true) {
			int num1 = Integer.parseInt(br.readLine());
			if(num1 == 0) break;
			
			int num2 = num1 * 2;
			int count = 0;
			for(int i=2; i<=num2; i++) {
				arr[i] = true;
			}
			
			for(int i=2; i<=Math.sqrt(num2); i++) {
				if(arr[i]) {
					for(int j=2; i*j<=num2; j++) {
						arr[i*j] = false;
					}
				}
			}
			
			for(int i=num1+1; i<=num2; i++) {
				if(arr[i]) count++;
			}		
			System.out.println(count);
		}
	}
}