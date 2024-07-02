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
			
			if(s.equals("0 0")) {
				break;
			}
			
			st = new StringTokenizer(s);			
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int a = 2*b - c;
			System.out.println(a);
		}
	}
}