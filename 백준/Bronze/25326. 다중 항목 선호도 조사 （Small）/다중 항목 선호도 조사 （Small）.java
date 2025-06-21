import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[][] list = new String[n][3];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<3;j++) {
				list[i][j] = st.nextToken();
			}
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			String c = st.nextToken();
			
			int ans = 0;
			for(int j=0;j<n;j++) {	
				if(!(a.equals("-")||a.equals(list[j][0]))) {
					continue;
				}
				
				if(!(b.equals("-")||b.equals(list[j][1]))) {
					continue;
				}
				
				if(!(c.equals("-")||c.equals(list[j][2]))) {
					continue;
				}
					
				ans++;
			}
			System.out.println(ans);
		}
	}
}