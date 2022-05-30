import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String num = br.readLine();
		int[] count = new int[9];
		
		for(int i=0; i<num.length(); i++) {  
			if(num.charAt(i) == '9') count[6]++;
			else count[(num.charAt(i)-'0')]++;
		}
		if(count[6]%2 == 0)
			count[6] = count[6] / 2;
		else
			count[6] = count[6] / 2 +1;
		Arrays.sort(count);
		System.out.println(count[count.length-1]);
				
	}	
}
