import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int a = s.charAt(0) - 'a';
		int b = s.charAt(1) - '0'- 1;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if((Math.abs(a-i) == 2 && Math.abs(b-j)==1) || (Math.abs(a-i)== 1 && Math.abs(b-j) == 2)) {
					System.out.println("" + (char)(i+'a') + (j + 1));
				}
			}
		}

	}
}
