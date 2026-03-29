import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		int[] count = new int[10];
		
		for(int i=a;i<=b;i++) {
			String k = String.valueOf(i);
			
			for(int j=0;j<k.length();j++) {
				count[k.charAt(j)-'0']++;
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(count[i] + " ");
		}
	}
}
