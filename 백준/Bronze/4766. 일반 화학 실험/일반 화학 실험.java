import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		double a = Double.parseDouble(br.readLine());
		while(true) {
			double b = Double.parseDouble(br.readLine());
			
			if(b == 999) {
				break;
			}
			
			double ans = b-a;
			
			System.out.printf("%.2f", ans);
			System.out.println();
			a = b;			
		}
	}
}