import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int f = Integer.parseInt(s[1]);
		
		int a = 0;
		int b = 0;
		
		for(int i=0;i<n;i++) {
			int k = Integer.parseInt(br.readLine());
			
			if(k < f) {
				a++;
			}else if(k > f){
				b++;
			}
		}
		
		if(a > b) {
			System.out.println(1);
		}else if(a < b) {
			System.out.println(2);
		}else {
			System.out.println(0);
		}
	}
}
