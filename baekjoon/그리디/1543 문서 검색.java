import java.util.Scanner;

public class Main { 
		
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		String find = sc.nextLine();
		int i=0;
		while(true) {
			if(word.indexOf(find) == -1) break;
			else {
				i++;
				word = word.substring(word.indexOf(find)+find.length());
			}
		}
		
		System.out.println(i);
	}
}