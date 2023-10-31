import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		
		if(a>=1 && a<=12) {
			if(b>=0 && b<=59 && c>=0 && c<=59) {
				ans+=2;
			}			
		}
		
		if(b>=1 && b<=12) {
			if(a>=0 && a<=59 && c>=0 && c<=59) {
				ans+=2;
			}	
		}
		
		if(c>=1 && c<=12) {
			if(a>=0 && a<=59 && b>=0 && b<=59) {
				ans+=2;
			}	
		}
		
		System.out.println(ans);
		
	
	}
}