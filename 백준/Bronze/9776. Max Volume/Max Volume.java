import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine().trim());
		
		double ans = 0;
		double pi = 3.14159;
		
		for(int tc=0;tc<n;tc++) {
			st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			
			if(s.equals("S")) {
				double r = Double.parseDouble(st.nextToken());
				
				double V = 4*pi*r*r*r / 3.0d;
				
				ans = Math.max(ans, V);
			}else if(s.equals("C")) {
				double r = Double.parseDouble(st.nextToken());
				double h = Double.parseDouble(st.nextToken());
				
				double V = pi*r*r*h / 3.0d;
				
				ans = Math.max(ans, V);
			}else {
				double r = Double.parseDouble(st.nextToken());
				double h = Double.parseDouble(st.nextToken());
				
				double V = pi*r*r*h;
				
				ans = Math.max(ans, V);
			}
		}
		System.out.printf("%.3f",ans);		
	}
}