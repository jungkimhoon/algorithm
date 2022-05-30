
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[][] arr = new int[26][2];
		int num = 0;
		int count = 0;
		for(int i=0; i<26; i++) {
			arr[i][0] = arr[i][1] = 0;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(arr[str.charAt(i)-'A'][0] > 0) arr[str.charAt(i)-'A'][1] = ++num;
			else arr[str.charAt(i)-'A'][0] = ++num;
		}
		
		for(int i=0; i<26; i++) {
			for(int j=0; j<26; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] > arr[j][0] && arr[i][1] < arr[j][1]) count++;
			}
		}
		
		System.out.println(count);
	}
}