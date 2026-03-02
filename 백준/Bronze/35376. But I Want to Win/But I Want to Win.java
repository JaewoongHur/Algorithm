import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		
		Arrays.sort(arr);

		int d = sum / 2;
		
		if(arr[n-1] > d) {
			System.out.println("IMPOSSIBLE TO WIN");
			System.exit(0);
		}
		
		int a = 1;
		int b = arr[n-2];
		boolean pass = false;
		while(a<n-1) {
			
			b += arr[a-1];
			
			if(b > d) {
				System.out.println(a);
				pass = true;
				break;
			}
			
			a++;
		}
		
		if(!pass) {
			System.out.println("IMPOSSIBLE TO WIN");
		}
	}
}
