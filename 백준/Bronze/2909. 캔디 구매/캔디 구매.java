import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(st.nextToken());
		
		int n = Integer.parseInt(st.nextToken());
		
		System.out.println((int)(Math.round(a/Math.pow(10,n))*Math.pow(10, n)));
	}
}