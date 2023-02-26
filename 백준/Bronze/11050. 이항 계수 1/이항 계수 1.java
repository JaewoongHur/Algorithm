import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int ans = factorial(N)/(factorial(K)*factorial(N-K));
		System.out.println(ans);
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		int a = 1;
		for(int i=1;i<=n;i++) {
			a = a*i;
		}
		return a;
	}
	
}