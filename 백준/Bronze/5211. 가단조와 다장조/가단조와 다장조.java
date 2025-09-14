import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split("\\|");
		int n = s.length;
		
		int a = 0;
		int c = 0;
		
		for(int i=0;i<n;i++) {
			if(s[i].charAt(0)=='A'||s[i].charAt(0)=='D'||s[i].charAt(0)=='E') {
				a++;
			}else if(s[i].charAt(0)=='C'||s[i].charAt(0)=='F'||s[i].charAt(0)=='G') {
				c++;
			}
		}
		
		if(a > c) {
			System.out.println("A-minor");
		}else if(a < c) {
			System.out.println("C-major");
		}else {
			char x = s[n-1].charAt(s[n-1].length()-1);
			
			if(x == 'A' || x == 'D' || x == 'E') {
				System.out.println("A-minor");
			}else {
				System.out.println("C-major");
			}
		}
	}
}