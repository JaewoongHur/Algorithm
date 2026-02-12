import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		
		while(true) {
			s = br.readLine().trim();
			
			if(s.equals("0")) break;
			
			int n = Integer.parseInt(s);
			
			String a = "";
			
			while(n > 1) {
				String b = Integer.toBinaryString(n);
				a = b + a;
				n = b.length() - 1;
			}
			
			a = "0" + a;
			
			System.out.println(a);
		}
		
	}
}
