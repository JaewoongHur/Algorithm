import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idx = 1;
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			
			String[] list = new String[n+1];
			
			boolean[] check = new boolean[n+1];
			
			for(int i=1;i<=n;i++) {
				list[i] = br.readLine();				
			}
			
			for(int i=0;i<2*n-1;i++) {
				String[] s = br.readLine().split(" ");
				int a = Integer.parseInt(s[0]);
					check[a] = !check[a];
			}
			
			for(int i=1;i<=n;i++) {
				if(check[i]) {
					System.out.println(idx + " "+ list[i]);
					idx++;
				}
			}
		}
	}
}