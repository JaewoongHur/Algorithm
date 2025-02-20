import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		
		int X = a * p;
		
		int Y = 0;
		
		if(c>=p) {
			Y = b;
		}else {
			Y = b + (p-c)*d;
		}
		
		System.out.println(Math.min(X, Y));
	}
}