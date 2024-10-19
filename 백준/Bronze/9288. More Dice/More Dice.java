import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for(int tc=1;tc<=n;tc++) {
			int a = Integer.parseInt(br.readLine());
			
			
			System.out.println("Case " + tc + ":");
			
			for(int i=1;i<a/2+1;i++) {
				if(a-i > 6) {	
					continue;
				}
				
				System.out.println("("+i + "," +(a-i)+")");
			}
		}	
	}
}