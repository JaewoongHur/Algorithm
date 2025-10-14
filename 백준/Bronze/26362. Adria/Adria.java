import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int g = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer>[] arr = new ArrayList[n];
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			
			arr[i] = new ArrayList<>();
			
			for(int j=0;j<a;j++) {
				int b = Integer.parseInt(br.readLine());
				arr[i].add(b);
			}
		}
		
		int ans = 0;
	
		for(int i=0;i<arr[0].size();i++) {
			if(arr[0].get(i) == 1) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
		int ans2 = 0;
		
		for(int i=0;i<n;i++) {
			int x = 0;
			int y = 0;
			for(int j=0;j<arr[i].size();j++) {				
				if(arr[i].get(j) == 1) {
					x++;
				}else {
					y++;
				}
				
				if(x == g) {
					break;
				}
				
				if(y == g) {
					ans2++;
					break;
				}
			}
		}
		System.out.println(ans2);
		
		int ans3 = 0;
		
		int max = 0;
		
		for(int i=g-1; i>=1;i--) {
			int set = 0;
			
			for(int j=0;j<n;j++) {
				int x = 0;
				int y = 0;
				for(int k=0;k<arr[j].size();k++) {					
					if(arr[j].get(k)==1) {
						x++;
					}else {
						y++;
					}
					
					if(x == i) {
						set++;
						break;
					}
					
					if(y == i) {
						break;
					}
					
				}
			}
			
			if(set >= max) {
				max = set;
				ans3 = i;
			}
		}
		System.out.println(ans3);
	}
}