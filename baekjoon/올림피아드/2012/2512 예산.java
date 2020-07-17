import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] a = new int[10];
		int[] b = new int[10];
		int sumA = 0;
		int sumB = 0;
		char c = '0';
		
		for(int i=0; i<10; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<10; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<10; i++) {
			if(a[i] > b[i]) {
				sumA += 3;
				c = 'A';			
			}
			else if(a[i] < b[i]) {
				sumB += 3;
				c = 'B';				
			}
			else {
				sumA += 1;
				sumB += 1;			
			}
		}
		System.out.println(sumA+" "+sumB);
		if(sumA > sumB) System.out.println("A");
		else if(sumA < sumB) System.out.println("B");
		else if(sumA == 10 && sumB == 10) System.out.println("D");
		else System.out.println(c);
	}
}
