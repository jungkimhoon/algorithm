import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		String str = br.readLine();
		stack.add(str.charAt(0));
		
		for(int i=1; i<str.length(); i++) {			
			if(str.charAt(i-1) == '(' && str.charAt(i) == ')') {
				if(stack.size()>1)
					count += stack.size()-1;
				stack.pop();
				
			}else if(str.charAt(i) == '(') {
				stack.add(str.charAt(i));
				
			}else if(str.charAt(i) == ')') {				
				count++;
				stack.pop();
			}		
		}
		
		System.out.println(count);		
	}
}