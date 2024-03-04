import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		
		double total = 0;
		double bedroomArea = 0;
		double halfBalcony = 0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			double a = Double.parseDouble(st.nextToken());
			String s = st.nextToken();
			
			if(s.equals("bedroom")) {
				bedroomArea += a;
			}
			
			if(s.equals("balcony")) {
				halfBalcony += a/2;
			}
			
			total += a;
		}
		
		System.out.println((int)total);
		System.out.println((int)bedroomArea);
		System.out.println((total-halfBalcony)*c);
	}
}