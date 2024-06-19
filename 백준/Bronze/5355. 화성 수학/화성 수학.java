import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = st.countTokens();
			
			double d = Double.parseDouble(st.nextToken());
			
			for(int i=0;i<n-1;i++) {
				String s = st.nextToken();
				
				if(s.equals("@")) {
					d*=3;
				}else if(s.equals("%")) {
					d+=5;
				}else if(s.equals("#")) {
					d-=7;
				}
			}
			System.out.printf("%.2f\n",d);
		}
	}
}