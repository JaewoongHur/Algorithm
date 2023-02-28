import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] =  Integer.parseInt(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> s = new Stack<>();
		
		for(int i =0;i<N;i++) {
			while(!s.isEmpty() && arr[s.peek()]<arr[i]) {
				arr[s.pop()] = arr[i];
			}
			s.push(i);	
		}

		while(!s.isEmpty()) {
			arr[s.pop()] = -1;
		}
		for(int i=0;i<N;i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);		
	}
}