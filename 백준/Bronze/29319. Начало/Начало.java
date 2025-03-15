import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		
		int max = 0;
			
		int sum = 0;
		
		for(int i=0;i<T;i++) {
			int a = Integer.parseInt(st.nextToken());
			
			sum += a;
			
			max = Math.max(max, a);
		}
		System.out.println(sum-max);
	}
}