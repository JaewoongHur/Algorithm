import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int max = 0;
		
		for(int i=0;i<n;i++) {
			max = Math.max(max, Integer.parseInt(st.nextToken()));
		}
		System.out.println(max);
	}
}