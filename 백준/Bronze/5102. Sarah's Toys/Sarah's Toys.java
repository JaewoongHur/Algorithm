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
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int c = a - b;
			
			if(c<=1) {
				System.out.println("0 0");
			}else if(c==2) {
				System.out.println("1 0");
			}else {
				if(c%2==0) {
					System.out.println(c/2 + " 0");
				}else {
					System.out.println((c-3)/2 + " 1");
				}
			}
		}
	}
}