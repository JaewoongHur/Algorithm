import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = "";
		if(!a.equals("0")) {
			b = st.nextToken();
		}		
		long ans = 0;
		for(int i=0;i<a.length();i++) {
			int c = a.charAt(i)-'0';
			for(int j=0;j<b.length();j++) {
				int d = b.charAt(j)-'0';
				ans+= c*d;
			}			
		}
		
		System.out.println(ans);
	}
}