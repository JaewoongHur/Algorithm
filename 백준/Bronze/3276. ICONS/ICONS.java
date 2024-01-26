import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = (int) Math.sqrt(n);
		
		int b = n/a;
		int c = n%a;
		
		if(c!=0) {
			b++;
		}
		
		System.out.println(a + " " + b);
	}
}