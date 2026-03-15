import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(":");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		int[] x = new int[] {3,0,0,0,1,1,1,2,2,2};
		int[] y = new int[] {1,0,1,2,0,1,2,0,1,2};
		
		int min = 1000;
		
		int h = 0; int m = 0;
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(i%24 == a%24 && j%60 == b%60) {
					int h1 = i/10;
					int h2 = i%10;
					int m1 = j/10;
					int m2 = j%10;
					
					int d = Math.abs(x[h1]-x[h2]) + Math.abs(y[h1]-y[h2]) + Math.abs(x[h2]-x[m1]) + Math.abs(y[h2]-y[m1]) + Math.abs(x[m1]-x[m2]) + Math.abs(y[m1]-y[m2]);
					if(min > d) {
						min = d;
						h = 10*h1 + h2; m = 10*m1 + m2;
					}
				}
			}
		}
		
		System.out.println(h/10 + "" + h%10 + ":" + m/10 + "" + m%10);
	}
}
