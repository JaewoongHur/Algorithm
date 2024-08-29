import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s; 
		
		while(true) {
			s = br.readLine();
			if(s == null || s.isEmpty()) {
				break;
			}
			
			int a = Integer.parseInt(s);
			s = Integer.toBinaryString(a);
			
			int c0 = 0;
			int c1 = 0;
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='0') {
					c0++;
				}else {
					c1++;
				}
			}
			
			if(c0>c1) {
				System.out.println("left");
			}else if(c0==c1) {
				System.out.println("straight");
			}else {
				System.out.println("right");
			}
		}
	}
}