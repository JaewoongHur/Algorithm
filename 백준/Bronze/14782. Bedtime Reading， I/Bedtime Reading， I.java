import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i=1;i<=(int) Math.sqrt(n);i++) {
			if(n%i == 0) {
				sum += i + (n/i);
			}
		}
		
		if((int) Math.sqrt(n) == Math.sqrt(n)) {
			sum -= (int) Math.sqrt(n);
		}
		
		System.out.println(sum);
	}
}