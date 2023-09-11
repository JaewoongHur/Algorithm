import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		int max = 0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a==b && b==c) {
				max = Math.max(max, 10000+a*1000);
			}
			else if(a!=b && b!=c && c!=a) {
				int t = Math.max(a, b);
				t = Math.max(t, c);
				max = Math.max(max, 100*t);
			}
			else {
				if(a==b) {
					max = Math.max(max, 1000+a*100);
				}
				else if(b==c) {
					max = Math.max(max, 1000+b*100);
				}
				else{
					max = Math.max(max, 1000+c*100);
				}
			}
			
		}
		System.out.println(max);
	}
}