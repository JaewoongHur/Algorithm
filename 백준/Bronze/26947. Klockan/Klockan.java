import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<12;i++) {
			for(int j=0;j<60;j++) {
				double dh = 30 * i + 0.5 * (double)j;
				double dm = 6 * (double)j;
				
				double deg = dm - dh;
				if(deg < 0) {
					deg += 360;
				}
				
				if((int)10*deg == n) {
					System.out.println((i/10) + "" + (i%10) + ":" + (j/10) + (j%10));
				}
				
			}
		}
		
	}
}
