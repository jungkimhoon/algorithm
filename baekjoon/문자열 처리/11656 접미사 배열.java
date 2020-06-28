import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = new String[str.length()];
		arr[0] = str;
		
		for(int i=1; i<arr.length; i++) {
			arr[i] = arr[i-1].substring(1);
		}
		
		Arrays.sort(arr);
		
		for(String i : arr) {
			System.out.println(i);
		}
	}
}