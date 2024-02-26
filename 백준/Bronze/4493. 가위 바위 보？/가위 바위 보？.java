import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=T;tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int x = 0;
			int y = 0;
			
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				
				String a = st.nextToken();
				String b = st.nextToken();
				
				if(a.equals("R") && b.equals("P")) {
					y++;
				}else if(a.equals("R") && b.equals("S")) {
					x++;
				}else if(a.equals("P") && b.equals("S")) {
					y++;
				}else if(a.equals("P") && b.equals("R")) {
					x++;
				}else if(a.equals("S") && b.equals("R")) {
					y++;
				}else if(a.equals("S") && b.equals("P")) {
					x++;
				}				
				
			}
			if(x>y) {
				sb.append("Player 1").append('\n');
			}else if(y>x) {
				sb.append("Player 2").append('\n');
			}else {
				sb.append("TIE").append('\n');
			}
		}
		System.out.println(sb.toString());		
	}
}