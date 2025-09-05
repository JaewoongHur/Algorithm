import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		int x = b;
		int y = (a+b)%10;
		
		int num = 3;
		
		while(a!=x || b!=y) {
			int tmp = (x+y)%10;
			x = y;
			y = tmp;
			
			num++;
		}
		System.out.println(num);
		
	}
}