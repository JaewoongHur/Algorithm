import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] A = new int[n];
		int[] B = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			if(A[i] - B[i] > 0) {
				sum += A[i] - B[i];
			}
		}
		
		System.out.println(sum);
	}
}