public class Main {	
	
	public static void main(String[] args) {						
		
		String n = "1";
		boolean[] arr = new boolean[1000001];

		while(true) {
			int num = Integer.parseInt(n);
			for(int i=0; i<n.length(); i++) {
				num += n.charAt(i) - '0' ;
			}
			arr[num] = true;
			if(num > 100000) break;
			
			n = Integer.parseInt(n)+1+""; 
		}
		
		for(int i=1; i<10001; i++) {
			if(!arr[i]) System.out.println(i);
		}
	}
}