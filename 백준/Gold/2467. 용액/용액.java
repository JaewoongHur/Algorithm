import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int s = 0;
		int e = n-1;
		
		int x = 0; int y = 0;
		
		int min = Integer.MAX_VALUE;
		
		while(s<e && e<n && s<n ) {
			int sum = arr[s] + arr[e];
			int gap = Math.abs(sum);
			if(gap < min) {			
				x = s;
				y = e;
				min = gap;
			}
			if(sum > 0 ) {
				e--;
			}
			else if(sum<0) {
				s++;
			}
			else {
				break;
			}
			
		}
		System.out.println(arr[x] + " " + arr[y]);
	}

}