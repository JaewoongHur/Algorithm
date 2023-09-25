import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			double a = Double.parseDouble(st.nextToken());
			String b = st.nextToken();
			
			if(b.equals("kg")) {
				a *= 2.2046;
				System.out.printf("%.4f",a);
				System.out.println(" lb");
			}
			else if(b.equals("lb")) {
				a *=0.4536;
				System.out.printf("%.4f",a);
				System.out.println(" kg");
			}
			else if(b.equals("l")) {
				a *= 0.2642;
				System.out.printf("%.4f",a);
				System.out.println(" g");
			}
			else if(b.equals("g")) {
				a *= 3.7854;
				System.out.printf("%.4f",a);
				System.out.println(" l");
			}
		}
	}
}