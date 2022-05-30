import java.util.Scanner;
import java.util.Stack;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Character> stack = new Stack<Character>();
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				if(!stack.isEmpty() && stack.peek() == s.charAt(j)) {
					stack.pop();
				}else stack.add(s.charAt(j));
			}
			if(stack.isEmpty()) count++;
			stack.clear();
		}		
		
		System.out.println(count);
				
	}
}