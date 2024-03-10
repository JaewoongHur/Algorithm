import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int x = arr[0] | arr[1];
		
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(i==0 && j==1) continue;
				x ^= (arr[i] | arr[j]);
			}
		}
		
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				for(int k=j+1;k<10;k++) {
					x ^= arr[i] | arr[j] | arr[k];
				}
			}
		}
		System.out.println(x);		
	}
}