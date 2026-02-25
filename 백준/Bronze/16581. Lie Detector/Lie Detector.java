import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[n];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			if(s.equals("TRUTH")) {
				arr[i] = true;
			}
		}
		
		boolean t = arr[n-1];

		for(int i=n-2;i>=0;i--) {
			t = !(t^arr[i]);
		}
		
		if(t) {
			System.out.println("TRUTH");
		}else {
			System.out.println("LIE");
		}
	}
}
