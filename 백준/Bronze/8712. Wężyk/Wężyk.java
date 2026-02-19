import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2 == 0) {
					System.out.print(a++ + " ");
				}else {
					System.out.print(a-- + " ");
				}
			}
			if(i%2 == 0) {
				a += n-1;
			}else {
				a += n+1;
			}
			System.out.println();
		}
		
	}
}
