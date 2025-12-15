import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		
		int s = 0;
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			s += a;
		}
		
		System.out.println(x*(n+1) - s);

	}
}
