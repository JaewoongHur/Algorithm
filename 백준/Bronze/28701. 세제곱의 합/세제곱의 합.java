import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 0;
		
		for(int i=1;i<=n;i++) {
			a += i;
		}
		
		int b = 0;
		
		for(int i=1;i<=n;i++) {
			b += i*i*i;
		}
		
		System.out.println(a);
		System.out.println(a*a);
		System.out.println(b);
		
	}
}
