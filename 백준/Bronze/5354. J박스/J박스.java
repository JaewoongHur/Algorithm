import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n==1) {
				System.out.println("#");
				System.out.println();
				continue;
			}
			
			if(n==2) {
				System.out.println("##");
				System.out.println("##");
				System.out.println();
				continue;
			}
			
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i>=1 && i<=n-2 && j>=1 && j<=n-2) {
						System.out.print("J");
					}else {
						System.out.print("#");
					}
				}
				System.out.println();
			}
			
			System.out.println();
		}
	}
}