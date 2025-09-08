import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int[] A = new int[5];
		
		for(int i=0;i<5;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		int[] B = new int[5];
	
		for(int i=0;i<5;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int ans = 0;
		
		for(int i=0;i<5;i++) {
			if(A[i] > B[i]) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}