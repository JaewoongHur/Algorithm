import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int[] A = new int[d+1];
		int[] B = new int[d+1];
		
		double total = 0;
		
		for(int i=0;i<p;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			A[a] += Integer.parseInt(st.nextToken());
			B[a] += Integer.parseInt(st.nextToken());
		}
		
		double WA = 0; double WB = 0;
		
		for(int i=1;i<=d;i++) {
			if(A[i] > B[i]) {
				WA += A[i] - (A[i]+B[i])/2 - 1;
				WB += B[i];
				System.out.println("A " + (A[i] - (A[i]+B[i])/2 - 1) +" "+ B[i]);
			}else {
				WA += A[i];
				WB += B[i] - (A[i]+B[i])/2 - 1;
				System.out.println("B " + A[i] +" "+ (B[i]- (A[i]+B[i])/2 - 1));
			}
		}
		
		for(int i=1;i<=d;i++) {
			total += A[i] + B[i];
		}
		
		System.out.println(Math.abs(WA-WB)/total);
		
	}
}
