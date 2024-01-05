import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(st.nextToken());
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		double c = Math.sqrt(a*a+b*b);
		
		for(int i=0;i<n;i++) {
			
			double d = Double.parseDouble(br.readLine());
			
			if(c>=d) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
	}
}