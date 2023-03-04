import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(tile(N));		
	}
	
	static int tile(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else {
			int fn1 = 2;
			int fn2 = 1;
			int fn = 0 ;
			for(int i=3;i<=n;i++) {
				fn = (fn1+fn2)%15746;
				fn2 = fn1;
				fn1 = fn;
			}
			return fn;
		}
	}
	
	
	
}