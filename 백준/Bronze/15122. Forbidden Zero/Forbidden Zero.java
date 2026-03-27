import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while(true) {
			n++;
			
			String s = String.valueOf(n);
			if(s.contains("0")) {
				continue;
			}else {
				System.out.println(n);
				break;
			}
		}
		
	}
}
