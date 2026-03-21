import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		double fuel = 0;
		double dist = 0;
		double a; double b;
		double prevD = 0.0d;
		double prevF = 0.0d;
		
		while(true) {
			s = br.readLine();
			
			st = new StringTokenizer(s);
			
			a = Double.parseDouble(st.nextToken());
			b = Double.parseDouble(st.nextToken());
			
			if(a == -1.0 && b == -1.0) {
				break;
			}
			
			if(a == 0.0 && b == 0.0) {
				System.out.println((int) Math.round(dist/fuel*prevF));
				fuel = 0.0d;
				dist = 0.0d;
				prevD = 0.0d;
				prevF = 0.0d;
				continue;
			}
			
			if(prevF <= b) {
				prevD = a;
				prevF = b;
				continue;
			}
			
			fuel += prevF - b; 
			dist += a - prevD;
			prevD = a;
			prevF = b;
		}
	}
}
