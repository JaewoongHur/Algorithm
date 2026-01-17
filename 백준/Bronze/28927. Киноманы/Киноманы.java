import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int z1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		int z2 = Integer.parseInt(st.nextToken());
		
		int max = 3 * x1 + 20 * y1 + 120 * z1;
		int mel = 3 * x2 + 20 * y2 + 120 * z2;
		
		if(max > mel) {
			System.out.println("Max");
		}else if(max == mel) {
			System.out.println("Draw");
		}else {
			System.out.println("Mel");
		}
		
	}
}
