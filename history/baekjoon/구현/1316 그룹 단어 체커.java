import java.util.Scanner;

public class Main { 
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<num; i++) {
			boolean[] alpha = new boolean[26];
			String input = sc.next();
			input = input.toLowerCase();
			for(int j=0; j<input.length(); j++) {
				char c = input.charAt(j);
				if(j>0 && c == input.charAt(j-1)) continue;
				if(alpha[c-'a']) {		
					count++;
					break;					
				}
				alpha[c-'a'] = true;
			}
		}
		
		System.out.println(num-count);
		
	
	}
}