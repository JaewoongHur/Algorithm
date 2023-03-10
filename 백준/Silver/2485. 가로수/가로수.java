import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		int sum = 0;
		int d = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		int[] B = new int[n-1];
		
		for(int i=0;i<n-1;i++) {
			B[i] = A[i+1] -A[i];
			sum+= B[i];
		}
		
		int k = 2;
		d =gcd(B[0],B[1]);
		while(d > 1 && k < n-1) {
			d = gcd(d,B[k]);
			k++;
		}
		int ans = sum/d - (n-1);
		System.out.println(ans);
	}
	static int gcd(int a, int b) {
		while(b!=0) {
			int r = a % b;
			a= b;
			b = r;
		}
		return a;
	}
}