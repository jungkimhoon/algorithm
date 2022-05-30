import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		int line = 0;
		int count = 0;
		int top = 0;
		int bottom = 0;
		
		while(true) {
			line++;
			count = line * (line+1) / 2;
			if(n <= count) break;
		}
		
		if(line % 2 == 0) {
			top = line - (count - n);
			bottom = 1 + (count - n);
		}else {
			top = 1 + (count - n);
			bottom = line - (count - n);
		}
		
		System.out.println(top+"/"+bottom);
	}
}
