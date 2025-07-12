import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double x = Double.parseDouble(br.readLine());
		double y = Double.parseDouble(br.readLine());
		double z = Double.parseDouble(br.readLine());
		
		double s = x*y*z;
		
		double a = s/z/z;
		double b = s/y/y;
		double c = s/x/x;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
