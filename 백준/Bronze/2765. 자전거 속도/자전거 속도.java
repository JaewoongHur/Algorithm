import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int idx = 1;
		while(true) {
			st = new StringTokenizer(br.readLine());
			double r = Double.parseDouble(st.nextToken());
			double rev = Double.parseDouble(st.nextToken());
			double t = Double.parseDouble(st.nextToken());
			
			if(rev==0.0d) {
				break;
			}
			
			double d = 3.1415927*r*rev/5280/12;
			double mph = 3600*d/t;
			System.out.print("Trip #"+idx+": ");
			System.out.printf("%.2f ",d);
			System.out.printf("%.2f",mph);
			System.out.println();
			idx++;
		}
	}
}