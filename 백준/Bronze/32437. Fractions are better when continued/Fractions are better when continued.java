import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 1;
		int b = 1;
		
		for(int i=0;i<n;i++) {
			int tmp = a;
			a = b;
			b = tmp + b;
		}
		System.out.println(a);
	}
}
