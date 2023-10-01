import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[a+b+c+1];
		
		int max = 0;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				for(int k=1;k<=c;k++) {
					arr[i+j+k]++;
				}
			}
		}
		int ans = 0;
		for(int i=0;i<a+b+c;i++) {
			if(max < arr[i]) {
				max = arr[i];
				ans = i;
			}
		}
		System.out.println(ans);
	}
}