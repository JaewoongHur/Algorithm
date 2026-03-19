import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int i = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(m % 2 == 0 || n % 2 == 0) {
			System.out.println("equal");
		}else {
			if((i+j)%2 == 0) {
				if(c == 0) {
					System.out.println("black");
				}else {
					System.out.println("white");
				}
			}else {
				if(c == 0) {
					System.out.println("white");
				}else {
					System.out.println("black");
				}
			}
		}
	}
}
