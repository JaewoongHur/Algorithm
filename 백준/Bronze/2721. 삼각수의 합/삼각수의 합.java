import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<T;tc++) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			for(int k=1;k<=n;k++) {
				sum += k * (k+1) * (k+2) / 2;
			}			
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}