import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] A;
	static int N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			if(isPalindrome(S-1,E-1)) {
				sb.append(1).append("\n");
			}
			else {
			sb.append(0).append("\n");
			}
		}
		System.out.println(sb);
		
	}
	private static boolean isPalindrome(int s , int e) {
		for(int i = 0 ;i<=(e-s)/2;i++) {
			if(A[s+i]==A[e-i]) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;		
	}
	
}