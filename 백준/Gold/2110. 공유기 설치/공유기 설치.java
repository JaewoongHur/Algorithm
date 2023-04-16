import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int N, C;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		C = Integer.parseInt(str[1]);
		
		arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int left = 1;
		int right = 1000000001;
		
		while(left < right) {
			int mid = (left + right) / 2;
			
			int cnt = 1;
			int last = arr[0];
			
			for(int i=1;i<N;i++) {
				int cd = arr[i];
				if(cd - last >= mid) {
					cnt++;
					last = cd;
				}
			}
			
			if(cnt < C) {
				right = mid;
			}
			else {
				left = mid+1;
			}
			
		}
		
		System.out.println(right-1);
	}
	

}