import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] A = new int[5];
		int[] B = new int[5];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<5;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<5;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean pass = true;
		
		for(int i=0;i<5;i++) {
			if(A[i]+B[i]!=1) {
				pass = false;
				break;
			}
		}
		
		if(pass) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
	}
}