import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int origin = num;
		int i=0;
		
		
		while(true) {
			i++;
			if(num<10) num = num + num*10;
			else num = (num%10 + num/10)%10 + num%10*10;
			
			if(origin == num) break;
		}
		bw.write(i+"\n");
		bw.flush();
		bw.close();		
	}
}