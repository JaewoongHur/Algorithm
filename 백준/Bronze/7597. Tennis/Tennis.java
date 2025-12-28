import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		
		while(true) {
			s = br.readLine();
			if(s.equals("#")) {
				break;
			}
			
			int sA = 0;
			int sB = 0;
			
			int a = 0;
			int b = 0;
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='A') {
					a++;
				}else {
					b++;
				}
				
				if(a>=4 && a >= b + 2) {
					sA++;
					a = 0; b = 0;
				}else if(b>=4 && b >= a + 2) {
					sB++;
					a = 0; b = 0;
				}
				
			}
			
			System.out.println("A " + sA + " " + "B " + sB);
		}
	}
}
