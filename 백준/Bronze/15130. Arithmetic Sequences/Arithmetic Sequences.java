import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[10];
		
		int a = 0;
		int b = 0;
		
		for(int i=0;i<10;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] != 0) {
				if(a==0) {
					a = i;
				}else {
					b = i;
				}
			}
		}
		
		int c = 0;
		
		if((arr[b]-arr[a]) % (b-a) != 0) {
			System.out.println(-1);
			System.exit(0);
		}else {
			c = (arr[b] - arr[a])/(b-a);
		}
		
		for(int i=a-1;i>=0;i--) {
			arr[i] = arr[i+1] - c;
		}
		
		for(int i=a+1;i<10;i++) {
			arr[i] = arr[i-1] + c;
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
