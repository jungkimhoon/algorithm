import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] burger = new int[3];
		int[] coke = new int[2];
		int minBurger = 0;
		int minCoke = 0;
		
		burger[0] = Integer.parseInt(br.readLine());
		burger[1] = Integer.parseInt(br.readLine());
		burger[2] = Integer.parseInt(br.readLine());
		minBurger = Math.min(burger[0], Math.min(burger[1], burger[2]));
		
		coke[0] = Integer.parseInt(br.readLine());
		coke[1] = Integer.parseInt(br.readLine());
		minCoke = Math.min(coke[0], coke[1]);
		
		System.out.println(minBurger+minCoke-50);
	}
}