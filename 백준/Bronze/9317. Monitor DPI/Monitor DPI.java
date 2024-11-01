import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0 0 0")) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			double d = Double.parseDouble(st.nextToken());
			double h = Double.parseDouble(st.nextToken());
			double v = Double.parseDouble(st.nextToken());
			
			double dh = Math.sqrt(337)*h/(16*d);
			double dv = Math.sqrt(337)*v/(9*d);
			
			System.out.printf("Horizontal DPI: %.2f\n", dh);
			System.out.printf("Vertical DPI: %.2f\n", dv);
		}
	}
}