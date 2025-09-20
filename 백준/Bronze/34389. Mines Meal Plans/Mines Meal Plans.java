import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken();
			String b = st.nextToken();
			int c = Integer.parseInt(st.nextToken());
			double d = Double.parseDouble(st.nextToken());
			
			int s = 0;
			double m = 0;
					
			if(b.equals("Marble")) {
				s = 19 - c;
				m = 200 - d;
			}else if(b.equals("Marble+")) {
				s = 19 - c;
				m = 350 - d;
			}else if(b.equals("Quartz")) {
				s = 14 - c;
				m = 200 - d;
			}else {
				s = 14 - c;
				m = 350 - d;
			}
			
			System.out.printf(a + " " + s + " %.2f ", m);
			
			if(s > 0 && m > 0) {
				System.out.println("Use meal swipe or munch money");
			}else if(s > 0 && m <= 0) {
				System.out.println("Use meal swipe");
			}else if(s <= 0 && m > 0) {
				System.out.println("Use munch money");
			}else {
				System.out.println("Go to Downtown Golden!");
			}
			
		}
	}
}