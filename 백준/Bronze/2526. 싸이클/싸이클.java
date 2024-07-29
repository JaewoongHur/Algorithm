import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int p = Integer.parseInt(s[1]);
		
		boolean[] check = new boolean[97];
		
		int a = n;
		int b = 0;
		
		while(true) {
			
			a = a * n % p;
			if(!check[a]) {
				check[a] = true;
			}else {
				b = a;
				break;
			}
		}
		
		int ans = 0;
		
		a = b;
		
		while(true) {
			a = a * n % p;
			
			ans ++;
			
			if(a == b) {
				break;
			}
		}
		
		System.out.println(ans);
	}
}