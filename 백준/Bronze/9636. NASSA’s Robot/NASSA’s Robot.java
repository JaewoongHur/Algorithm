import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String a = br.readLine();
			
			int q = 0;
			int x = 0;
			int y = 0;			
			
			for(int j=0;j<a.length();j++) {
				if(a.charAt(j)=='?') {
					q++;
				}else if(a.charAt(j)=='U') {
					y++;
				}else if(a.charAt(j)=='D') {
					y--;
				}else if(a.charAt(j)=='R') {
					x++;
				}else {
					x--;
				}
			}
			
			System.out.println((x-q) + " " + (y-q) + " " + (x+q) + " " + (y+q));
			
		}
	}
}