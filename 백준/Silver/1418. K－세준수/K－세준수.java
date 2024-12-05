import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());

		boolean[] prime = new boolean[100001];

		for (int i = 2; i*i <= 100000; i++) {
			if (prime[i])
				continue;
			for (int j = 2*i; j <= 100000; j += i) {
				if (prime[j])
					continue;
				prime[j] = true;
			}
		}
		
		int a = 0;		
		
		boolean[] arr = new boolean[n+1];
		
		for(int i=k+1;i<=n;i++) {
			if(prime[i]) continue;
			
			for(int j=i;j<=n;j+=i) {
				if (arr[j])
					continue;
				arr[j] = true;
			}
		}
		
		for(int i=1;i<=n;i++) {
			if(!arr[i]) {
				a++;
			}
		}
		
		System.out.println(a);
		
	}
}