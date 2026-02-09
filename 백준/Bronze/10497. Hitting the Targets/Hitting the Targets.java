import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[T][5];
		
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken();
			
			if(a.equals("rectangle")) {
				arr[i][0] = 1;
				arr[i][1] = Integer.parseInt(st.nextToken());
				arr[i][2] = Integer.parseInt(st.nextToken());
				arr[i][3] = Integer.parseInt(st.nextToken());
				arr[i][4] = Integer.parseInt(st.nextToken());
			}else {
				arr[i][0] = 0;
				arr[i][1] = Integer.parseInt(st.nextToken());
				arr[i][2] = Integer.parseInt(st.nextToken());
				arr[i][3] = Integer.parseInt(st.nextToken());
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			
			for(int j=0;j<T;j++) {
				if(arr[j][0] == 1) {
					if(arr[j][1]<=a && arr[j][3] >=a && arr[j][2]<=b && arr[j][4]>=b) {
						cnt++;
					}
				}else{
					if((arr[j][1]-a)*(arr[j][1]-a) + (arr[j][2]-b)*(arr[j][2] - b) <= arr[j][3] * arr[j][3]) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
}
