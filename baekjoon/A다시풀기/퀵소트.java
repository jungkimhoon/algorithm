import java.util.*;
import java.io.*;

public class Main {	
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		QuickSort(arr, 0, n-1);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

	static void QuickSort(int[] arr, int left, int right) {
		int pl = left;
		int pr = right;
		int pivot = (left+right)/2;
		
		do {
			while(arr[pl] < arr[pivot]) pl++;
			while(arr[pr] > arr[pivot]) pr--;
			if(pl <= pr)
				Swap(arr, pl++, pr--);			
		}while(pl <= pr);
		
		if(pl < right) QuickSort(arr, pl, right);
		if(pr > left) QuickSort(arr, left, pr);
				
	}	
	
	static void Swap(int[] arr, int idx1, int idx2) {
		int t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;		
	}
	
}