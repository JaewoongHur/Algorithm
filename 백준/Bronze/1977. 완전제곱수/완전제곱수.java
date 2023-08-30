import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int a = (int) Math.sqrt(n);
		int sum = 0;
		int min = Integer.MAX_VALUE;
		if(a*a==n) {
			sum = a*a;
			min = a*a;
		}
		a++;
		while(a*a<=m) {
			sum+= a*a;
			if(min>a*a) {
				min = a*a;
			}
			a++;
		}
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
		System.out.println(sum);
		System.out.println(min);
		}
	}

}