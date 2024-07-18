import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			String s = br.readLine();
			
			int m = s.length();
			
			if(s.charAt((m-1)/2)==s.charAt((m-1)/2+1)) {
				System.out.println("Do-it");
			}else {
				System.out.println("Do-it-Not");
			}
		}
	}
}