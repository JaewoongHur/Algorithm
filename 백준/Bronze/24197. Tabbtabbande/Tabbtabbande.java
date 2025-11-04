import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[m+1];
		
		arr[0] = 1;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<m+1;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		
		for(int i=0;i<m;i++) {
			int a = Math.abs(arr[i] - arr[i+1]);
			
			if(a > n/2) {
				sum += n-a;
			}else {
				sum += a;
			}
		}
		System.out.println(sum);
	}
}