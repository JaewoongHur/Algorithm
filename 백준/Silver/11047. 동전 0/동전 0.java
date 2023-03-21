import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		int cnt =0;
		for(int i=N-1;i>=0;i--) {
				cnt+= K/A[i];	
				K -= (K/A[i])*A[i];
				if(K==0) {
					break;
			}
		}
		System.out.println(cnt);
		
	}
}