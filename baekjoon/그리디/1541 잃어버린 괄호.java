
import java.util.*;
import java.io.*;

public class Main {		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum1 = 0;
		int sum2 = 0;
		String str1 = br.readLine();
		String[] str2 = str1.split("-");
		
		String[] numOne = str2[0].split("\\+");
		for(int i=0; i<numOne.length; i++) {
			sum1 += Integer.parseInt(numOne[i]);
		}
		
		for(int i=1; i<str2.length; i++) {
			String[] num = str2[i].split("\\+");
			for(int j=0; j<num.length; j++) {
				sum2 += Integer.parseInt(num[j]);
			}			
		}
		
		System.out.println(sum1-sum2);
	}
}

