import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String X = st.nextToken();
		String Y = st.nextToken();

		System.out.println(Rev(Integer.toString(Rev(X)+Rev(Y))));
		
	}
	private static int Rev(String s) {
		int n = s.length();
		
		String newStr = "";
		
		for(int i=0;i<n;i++) {
			newStr += s.charAt(n-1-i);
		}
	
		return Integer.parseInt(newStr);
	}
	
}