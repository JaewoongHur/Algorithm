import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		boolean myun = false;

		boolean hyun = false;

		String s = String.valueOf(n);

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}

		if (n > 5 && sum % 2 == 1) {
			myun = true;
		}

		if (n == 2 || n == 4) {
			hyun = true;
		}

		boolean[] prime = new boolean[2701];

		for (int i = 2; i * i <= 2700; i++) {
			if (prime[i])
				continue;

			for (int j = 2 * i; j <= 2700; j += i) {
				prime[j] = true;
			}
		}

		int k = n;
		
		if (prime[k]) {
			int cnt = 0;
			
			for(int i=2;i<=k;i++) {
				if(prime[i]) continue;
				
				if(k % i==0) {
					cnt++;
				}
				
				while(k % i==0) {
					k /= i;
				}
			}
			
			if(cnt % 2 == 0) {
				hyun = true;
			}
			
		}
		
		if (myun) {
			if (hyun) {
				System.out.println(4);
			} else {
				System.out.println(1);
			}
		} else {
			if (hyun) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}

	}
}