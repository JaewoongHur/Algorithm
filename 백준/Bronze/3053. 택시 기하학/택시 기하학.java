import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double area = Math.PI*N*N;
		double radius = 2*Math.pow(N, 2);
			
		String s = String.format("%.6f", area);
		String s2 = String.format("%.6f", radius);
		System.out.println(s);
		System.out.println(s2);
	}
}