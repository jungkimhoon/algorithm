import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			count += dial(str.charAt(i));
		}
		
		System.out.println(count);
	}

	private static int dial(char ch) {
		int num = 0;
		switch (ch) {
			case 'A': case 'B': case 'C':
				num = 3;
				break;
			case 'D': case 'E': case 'F':
				num = 4;
				break;
			case 'G': case 'H': case 'I':
				num = 5;
				break;
			case 'J': case 'K': case 'L':
				num = 6;
				break;
			case 'M': case 'N': case 'O':
				num = 7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				num = 8;
				break;
			case 'T': case 'U': case 'V':
				num = 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				num = 10;
				break;
		}
		return num;
	}
}
