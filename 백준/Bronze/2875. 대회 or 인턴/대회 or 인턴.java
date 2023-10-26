import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int max = 0;
		
		for(int i=0;i<=k;i++) {
			if(n-i<0 || m-(k-i)<0) continue;
			int x = 0;
			int a = n-i;
			int b = m-k+i;
			
			if(a <= 2*b) {
				x = a/2;
			}
			else {
				x = b;
			}
			max = Math.max(max, x);			
		}
		System.out.println(max);
		
	}
}