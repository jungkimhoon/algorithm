import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[num2+1];	
		
		for(int i=2; i<=num2; i++) {
			arr[i] = true;
		}
		
		for(int i=2; i<Math.sqrt(num2); i++) {
			if(arr[i]) {
				for(int j=2; i*j<=num2; j++) {
					arr[i*j] = false;
				}
			}
		}
		
		for(int i=num1; i<=num2; i++) {
			if(arr[i]) System.out.println(i);
		}		
	}
}