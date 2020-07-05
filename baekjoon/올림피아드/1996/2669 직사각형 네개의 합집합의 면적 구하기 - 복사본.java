import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[][] flag = new boolean[101][101];
        
        for(int i=0; i<4; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
    		int num1 = Integer.parseInt(st.nextToken());
    		int num2 = Integer.parseInt(st.nextToken());
    		int num3 = Integer.parseInt(st.nextToken());
    		int num4 = Integer.parseInt(st.nextToken());        		

        	for(int j=num1; j<num3; j++) {
        		for(int k=num2; k<num4; k++) {
        			flag[j][k] = true;
        		}
        	}
        }
        
        int count = 0;
        
        for(int i=1; i<101; i++) {
        	for(int j=1; j<101; j++) {
        		if(flag[i][j]) count++;
        	}
        }
        
        System.out.println(count);
    }
}