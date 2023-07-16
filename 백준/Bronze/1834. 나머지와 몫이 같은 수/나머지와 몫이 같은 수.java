import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Integer.parseInt(br.readLine());
		
		long res = 0;
		
		for(long i=1;i<n;i++) {
			res += i*n+i;
		}
		
		System.out.println(res);
	}	
}