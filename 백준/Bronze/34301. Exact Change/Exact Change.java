import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;

		a = n / 150;
		n = n % 150;

		b = n / 30;
		n = n % 30;

		c = n / 15;
		n = n % 15;

		d = n / 5;

		e = n % 5;
		
		
		System.out.println(e + " " + d + " " + c + " " + b + " " + a);
		
	}
}
