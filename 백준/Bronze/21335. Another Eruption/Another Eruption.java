import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		double a = Double.parseDouble(br.readLine());
		
		double r = Math.sqrt(a/Math.PI);
		
		System.out.println(2*Math.PI*r);
	}
}