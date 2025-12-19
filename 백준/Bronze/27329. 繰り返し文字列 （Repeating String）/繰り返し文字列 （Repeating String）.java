import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		String a = s.substring(0, n/2);
		String b = s.substring(n/2, n);
		
		if(a.equals(b)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}