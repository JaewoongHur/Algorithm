import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;
		
		while((s=br.readLine())!=null) {
			st = new StringTokenizer(s);
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int chicken = n;
			int cnt = 0;
			while(true) {
				int m = chicken/k;
				if(m == 0) {
					cnt+=chicken;
					break;
				}
				cnt+=m*k;
				
				chicken -= m*k-m;	
			}
			System.out.println(cnt);
		}
	}
}