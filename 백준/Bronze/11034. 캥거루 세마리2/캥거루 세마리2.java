import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;
		while((s = br.readLine())!= null) {
			st = new StringTokenizer(s);
			
			int[] arr = new int[3];
			
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			System.out.println(Math.max(arr[2]-arr[1], arr[1]-arr[0]) - 1);			
		}
	}
}
