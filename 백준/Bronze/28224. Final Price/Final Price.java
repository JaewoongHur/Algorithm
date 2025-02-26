import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine().trim());
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine().trim());
			sum += a;
		}
		
		System.out.println(sum);
	}
}