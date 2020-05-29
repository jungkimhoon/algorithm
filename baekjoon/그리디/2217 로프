import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] rope = new int[n];
		int k = rope.length;
		int max = 0;
		
		for(int i=0; i<rope.length; i++) {
			rope[i] = sc.nextInt();
		}
		
		Arrays.sort(rope);
		
		for(int i=rope.length-1; i>=0; i--) {
			if(max <= rope[i]*(rope.length-i)) max = rope[i]*(rope.length-i);
		}
		
		System.out.println(max);
		
	}
}
