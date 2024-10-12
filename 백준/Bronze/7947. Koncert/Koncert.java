import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<T;tc++) {
			long x = 0; long y = 0; long z = 0;
			double x1 = 0; double y1 = 0; double z1 = 0;			
			
			for(int i=0;i<10;i++) {
				st = new StringTokenizer(br.readLine());
				
				double a = Double.parseDouble(st.nextToken());
				double b = Double.parseDouble(st.nextToken());
				double c = Double.parseDouble(st.nextToken());
				
				x1 += a; y1 += b; z1 += c;
			}
			
			x = Math.round(x1/10);
			y = Math.round(y1/10);
			z = Math.round(z1/10);
			
			System.out.println(x + " " + y + " "+ z);
		}
	}
}