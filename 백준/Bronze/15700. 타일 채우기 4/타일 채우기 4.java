import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		if(b>a) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		
		long k = 0;
		
		k += a * (b/2);
		
		if(b%2==1) {
			k += a/2;
		}
		System.out.println(k);
	}
}