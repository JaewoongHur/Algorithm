import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int num = 0;
		
		while(true) {
			if(x%3 == 0) {
				x++;
			}else if(x%3 == 1) {
				x *= 2;
			}else {
				x *= 3;
			}
			
			num++;
			if(x>=n) break;
		}
		System.out.println(num);
	}
}
