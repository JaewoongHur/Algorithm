import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		int n = n0;
		if((c-a1)>=0 && a1*n+a0 <= c*n) {
			n++;
		}		
		if (n == n0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}