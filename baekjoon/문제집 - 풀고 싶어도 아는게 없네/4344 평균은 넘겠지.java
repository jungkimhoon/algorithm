import java.util.*;
import java.io.*;

public class Main {	

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int c = Integer.parseInt(br.readLine());
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int[] arr = new int[num];
			double avg = 0;
			int count = 0;
			
			for(int j=0; j<num; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=0; j<num; j++) {
				avg += arr[j];
			}
			
			avg /= num;
				
			for(int j=0; j<num; j++) {
				if(arr[j] > avg) count++;
			}		
			
			double answer = ((double)count)/num*100;
		
			System.out.println(String.format("%.3f", answer)+"%");					
		}
	}
}