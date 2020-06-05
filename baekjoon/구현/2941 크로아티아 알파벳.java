import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 

		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());		
		String input = st.nextToken();
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<croatia.length; i++) {
			if(input.contains(croatia[i])) {
				input = input.replaceAll(croatia[i], "1");
			}
		}
		
		System.out.println(input.length());
	}
}