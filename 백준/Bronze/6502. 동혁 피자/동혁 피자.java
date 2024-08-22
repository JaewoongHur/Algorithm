import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		int tc = 1;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			int r = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());			
			
			double d = r * 2;
			
			double h = Math.sqrt(w*w + l*l); 
			
			if(d<h) {
				System.out.println("Pizza " + tc + " does not fit on the table.");
			}else {
				System.out.println("Pizza " + tc + " fits on the table.");
			}
				
		   tc++;
		}
	}
}