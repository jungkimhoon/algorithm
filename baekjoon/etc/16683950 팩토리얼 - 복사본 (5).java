import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public int factorial(int num) {
		if(num <= 1) return num;
		else return factorial(num-1)*num;
	}
	
	
    public static void main(String[] args) throws IOException{
     	Main aa = new Main();
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	if(num == 0) {
    		System.out.println("1");
    
    	}
    	else System.out.println(aa.factorial(num));
    	
    	}
}
