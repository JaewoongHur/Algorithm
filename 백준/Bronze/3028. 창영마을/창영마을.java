import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[3];
		arr[0] = 1;
		String s = br.readLine();
		
		int tmp = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A') {
				tmp = arr[1];
				arr[1] = arr[0];
				arr[0] = tmp;			
			}else if(s.charAt(i)=='B') {
				tmp = arr[2];
				arr[2] = arr[1];
				arr[1] = tmp;	
			}else {
				tmp = arr[2];
				arr[2] = arr[0];
				arr[0] = tmp;	
			}
		}
		
		int ans = 0;
		
		for(int i=0;i<3;i++) {
			if(arr[i] == 1) {
				ans = i+1;
			}
		}
		System.out.println(ans);
	}
}