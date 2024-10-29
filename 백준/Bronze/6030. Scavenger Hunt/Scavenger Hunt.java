import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int n = 0;
		int m = 0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				n++;
			}
		}
		
		for(int i=1;i<=b;i++) {
			if(b%i==0) {
				m++;
			}
		}
		
		int[] A = new int[n];
		int[] B = new int[m];
		
		int idx = 0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				A[idx] = i;
				idx++;
			}
		}
		
		idx = 0;
		
		for(int i=1;i<=b;i++) {
			if(b%i==0) {
				B[idx] = i;
				idx++;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println(A[i] + " " + B[j]);
			}
		}
		
	}
}