import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int a = arr[j]-arr[i];
				if(a<0) {
					continue;
				}else {
					if(max < a) {
						max = a;
					}
				}
			}
		}
		
		System.out.println(max);
		
	}
}
