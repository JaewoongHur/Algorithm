import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int L = Integer.parseInt(br.readLine());
		double A = Integer.parseInt(br.readLine());
		double B = Integer.parseInt(br.readLine());
		double C = Integer.parseInt(br.readLine());
		double D = Integer.parseInt(br.readLine());
		
		int x = (int)Math.ceil(A/C);
		int y = (int)Math.ceil(B/D);
		
		int ans = L - Math.max(x, y);
		System.out.println(ans);		
	}
}