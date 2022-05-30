import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] numbers = new int[42];
		
		for(int i=0; i<10; i++) {
			int x = Integer.parseInt(br.readLine()) % 42;
			numbers[x]++;
		}
		
		int sum = 0;
		for(int i=0; i<42; i++) {
			if(numbers[i] > 0) sum++;
		}
		
		System.out.println(sum);
	}
} 