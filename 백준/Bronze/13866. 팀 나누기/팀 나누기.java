import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[4];
		
		for(int i=0;i<4;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = Integer.MAX_VALUE;
		
		int a = Math.abs(arr[0]+arr[1] -(arr[2]+arr[3]));
		int b = Math.abs(arr[0]+arr[2] -(arr[1]+arr[3]));
		int c = Math.abs(arr[0]+arr[3] -(arr[1]+arr[2]));
		
		min = Math.min(min, a);
		min = Math.min(min, b);
		min = Math.min(min, c);
		
		System.out.println(min);
		
	}
}