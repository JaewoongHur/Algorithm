import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while(true) {
			int a = n;
			int sum = 0;

			while(a!=0) {
				sum += a % 10;
				a /= 10;
			}
			
			if(n % sum == 0) {
				break;
			}
			n++;
		}
		System.out.println(n);
	}
}
