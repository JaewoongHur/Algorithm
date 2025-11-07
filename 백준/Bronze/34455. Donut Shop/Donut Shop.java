import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = Integer.parseInt(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String op = br.readLine();
			int a = Integer.parseInt(br.readLine());
			
			if(op.equals("+")) {
				s += a;
			}else {
				s -= a;
			}
		}
		
		System.out.println(s);
		
	}
}
