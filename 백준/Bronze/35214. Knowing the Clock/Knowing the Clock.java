import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		if(b%12 == 0 && a%30 == b/12) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	
	}
}
