import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			int m = 0;
			
			for(int j=1;j<=10;j++) {
				int a = (j-1)%5+1;
				
				if(a==Integer.parseInt(st.nextToken())) {
					m++;
				}
			}
			
			if(m == 10) {
				System.out.println(i+1);
			}
		}
	}
}