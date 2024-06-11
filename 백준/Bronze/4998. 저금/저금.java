import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();
			if (s == null) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			double n = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double m = Double.parseDouble(st.nextToken());
			
			int y = 0;
			
			while(true) {
				if(n*Math.pow(1 + 0.01*b, y)>m) {
					break;
				}
				
				y++;
			}
			System.out.println(y);
		}
	}
}