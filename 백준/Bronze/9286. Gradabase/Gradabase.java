import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			System.out.println("Case " + tc + ":");
			
			for(int i=0;i<n;i++) {
				int a = Integer.parseInt(br.readLine());
				
				if(a==6) {
					continue;
				}
				System.out.println(a+1);
			}
		}
	}
}