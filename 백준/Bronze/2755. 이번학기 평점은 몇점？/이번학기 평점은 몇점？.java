import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		double k = 0;
		double m = 0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			
			double a = Double.parseDouble(st.nextToken());
			
			k += a;
			
			String s = st.nextToken();
			
			if(s.equals("A+")) {
				m += a * 4.3;
			}else if(s.equals("A0")) {
				m += a * 4.0;
			}else if(s.equals("A-")) {
				m += a * 3.7;
			}else if(s.equals("B+")) {
				m += a * 3.3;
			}else if(s.equals("B0")) {
				m += a * 3.0;
			}else if(s.equals("B-")) {
				m += a * 2.7;
			}else if(s.equals("C+")) {
				m += a * 2.3;
			}else if(s.equals("C0")) {
				m += a * 2.0;
			}else if(s.equals("C-")) {
				m += a * 1.7;
			}else if(s.equals("D+")) {
				m += a * 1.3;
			}else if(s.equals("D0")) {
				m += a * 1.0;
			}else if(s.equals("D-")) {
				m += a * 0.7;
			}else if(s.equals("F")) {
				m += a * 0.0;
			}
		}
		
		System.out.printf("%.2f", m/k);	
	}
}