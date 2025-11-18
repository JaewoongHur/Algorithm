import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		boolean[] check = new boolean[5];
		
		st = new StringTokenizer(br.readLine());

		for(int i=0;i<10;i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(!check[a]) {
				check[a] = true;
			}
		}
		
		int num = 0;
		
		for(int i=1;i<=4;i++) {
			if(!check[i]) {
				num++;
			}
		}
		
		System.out.println(num);

	}
}
