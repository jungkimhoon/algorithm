import java.util.*;
import java.io.*;

public class Main {	
	
	public static void main(String[] args) throws Exception {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       int inputcount = Integer.parseInt(br.readLine());
	       ArrayList<Integer> arr = new ArrayList<Integer>();
	       for (int i = 0; i < inputcount; i++){
	           arr.add(Integer.parseInt(br.readLine()));
	       }
	       Collections.sort(arr);
	       for (int i = 0; i < arr.size(); i++){
	           System.out.println(arr.get(i));
	       }			
	}	
}