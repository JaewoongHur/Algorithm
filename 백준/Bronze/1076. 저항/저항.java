import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x =resistance(br.readLine());
		int y = resistance(br.readLine());
		long z = multiply(br.readLine());
		
		long ans = (10*x+y)*z;
		System.out.println(ans);		
	}
	
	private static int resistance(String s) {
		if(s.equals("black")) {
			return 0;
		}
		else if(s.equals("brown")) {
			return 1;
		}
		else if(s.equals("red")) {
			return 2;
		}
		else if(s.equals("orange")) {
			return 3;
		}
		else if(s.equals("yellow")) {
			return 4;
		}
		else if(s.equals("green")) {
			return 5;
		}
		else if(s.equals("blue")) {
			return 6;
		}
		else if(s.equals("violet")) {
			return 7;
		}
		else if(s.equals("grey")) {
			return 8;
		}
		else {
			return 9;
		}
	}
	
	private static long multiply(String s) {
		if(s.equals("black")) {
			return 1;
		}
		else if(s.equals("brown")) {
			return 10;
		}
		else if(s.equals("red")) {
			return 100;
		}
		else if(s.equals("orange")) {
			return 1000;
		}
		else if(s.equals("yellow")) {
			return 10000;
		}
		else if(s.equals("green")) {
			return 100000;
		}
		else if(s.equals("blue")) {
			return 1000000;
		}
		else if(s.equals("violet")) {
			return 10000000;
		}
		else if(s.equals("grey")) {
			return 100000000;
		}
		else {
			return 1000000000;
		}
	}
}