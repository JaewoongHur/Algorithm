import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
		for(int i=0;i<n;i++) {
			String s =  br.readLine();
			
			String s2 = s.replace("PO", "PHO");
			System.out.println(s2);
		}
	}
}