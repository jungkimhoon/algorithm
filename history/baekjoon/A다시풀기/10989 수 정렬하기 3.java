import java.util.*;
import java.io.*;

public class Main {	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] number = new int[10001];
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			number[x]++;
		}
		
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<number[i]; j++) {
				sb.append(i+"\n");
			}
		}
		
		System.out.println(sb);		
	}	
}