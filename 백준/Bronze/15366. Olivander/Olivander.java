import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		int[] X = new int[n];
		int[] Y = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			X[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			Y[i] = Integer.parseInt(st.nextToken());
		}
	
		Arrays.sort(X);
		Arrays.sort(Y);
		
		boolean pass = true;
		
		for(int i=0;i<n;i++) {
			if(X[i] > Y[i]) {
				pass = false;
				break;
			}
		}
		
		if(pass) {
			System.out.println("DA");
		}else {
			System.out.println("NE");
		}
		
	}
}