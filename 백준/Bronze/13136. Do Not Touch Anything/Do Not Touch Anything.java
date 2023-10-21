import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		long x = 0;
		long y = 0;
		if(r%n==0) {
			x = r/n; 
		}
		else {
			x = r/n+1;
		}
		
		if(c%n==0) {
			y = c/n;
		}
		else {
			y= c/n+1;
		}
		
		System.out.println(x*y);
	}
}