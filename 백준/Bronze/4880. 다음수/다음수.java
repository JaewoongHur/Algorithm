import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(!(s=br.readLine()).equals("0 0 0")) {
			st = new StringTokenizer(s, " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(b-a == c-b) {
				System.out.println("AP "+ (c+b-a));
			}else if(b/a == c/b) {
				System.out.println("GP " + (c*(b/a)));
			}
		}
	}
}