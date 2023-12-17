import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		
		int x = 2*b+4*c;
		int y = 2*(a + c);
		int z = 4*a + 2*b;
		
		min = Math.min(x, Math.min(y, z));
		System.out.println(min);
	}
}