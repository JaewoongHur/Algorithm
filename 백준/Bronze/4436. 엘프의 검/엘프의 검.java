import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();

		while ((s = br.readLine()) != null) {
			int n = Integer.parseInt(s);
			
			
			int k = 0;
			long a = 0;
			boolean[] check = new boolean[10];
			
			boolean pass = true;
			while (pass) {
				a += n;
				++k;
				long b = a;
				
				while(b>0) {
					int x = (int)(b%10);
					if(!check[x]) {
						check[x] = true;
					}
					
					b /= 10;					
				}
				
				
				int cnt = 0;
				for(int i=0;i<10;i++) {
					if(!check[i]) continue;
					cnt++;
				}
				
				if(cnt==10) {
					pass = false;
				}
			}
			System.out.println(k);
		}

	}
}