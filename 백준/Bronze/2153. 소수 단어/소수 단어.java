import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] prime = new boolean[10000];

		for (int i = 2; i < 10000; i++) {
			if (prime[i])
				continue;
			for (int j = 2 * i; j < 10000; j += i) {
				prime[j] = true;
			}
		}

		int sum = 0;
		String s = br.readLine();
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)>=(int)('a')) {
			sum += s.charAt(i)-'a'+1;
			}
			else {
				sum += s.codePointAt(i)-'A'+27;
			}
		}
		
		if(prime[sum]) {
			System.out.println("It is not a prime word.");
		}
		else {
			System.out.println("It is a prime word.");
		}
		
	}
}