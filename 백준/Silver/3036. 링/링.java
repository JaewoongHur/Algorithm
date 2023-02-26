import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int r1 = Integer.parseInt(st.nextToken());
		for(int i=1;i<N;i++) {
			int r2 = Integer.parseInt(st.nextToken());
			int d = gcd(r1,r2);
			sb.append(r1/d).append('/').append(r2/d).append("\n");
		}
		System.out.println(sb);
	}
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r = a% b;
			a=b;
			b=r;
		}
		return a;		
	}
	
}