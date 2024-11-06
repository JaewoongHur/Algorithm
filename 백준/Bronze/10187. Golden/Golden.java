import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());
			
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			
			double c = (1+Math.sqrt(5))/2 - a/b;
			
			if(c>=-0.01 && c<=0.01) {
				System.out.println("golden");
			}else {
				System.out.println("not");
			}
		}
	}
}