import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			
			int x = a/100;
			int y = a%100;
			
			if((x*x+y*y)%7 == 1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
