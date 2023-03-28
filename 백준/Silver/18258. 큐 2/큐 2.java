import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int front=0,rear=0,size=0;
	static int[] arr = new int[2000000];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(s.equals("push")) {
				int a = Integer.parseInt(st.nextToken());
				push(a);
			}
			else if(s.equals("pop")) {
				pop();
			}
			else if(s.equals("front")) {
				front();
			}
			else if(s.equals("back")) {
				back();
			}
			else if(s.equals("size")) {
				sb.append(size).append("\n");
			}
			else {
				empty();
			}
		}
		System.out.println(sb);
	}
	static void push(int k) {
		arr[rear++] = k;
		size++;
	}
	
	static void pop() {
		if(size==0) {
			sb.append(-1).append("\n");
		}
		else {
			sb.append(arr[front]).append("\n");
			front++;
			size--;
		}
		
	}
	static void front() {
		if(size==0) {
			sb.append(-1).append("\n");
		}
		else {
			sb.append(arr[front]).append("\n");
		}
	}
	
	static void back() {
		if(size==0) {
		sb.append(-1).append("\n");
		}
		else {
			sb.append(arr[rear-1]).append("\n");
		}
	}
	
	static void empty() {
		if(size==0) {
			sb.append(1).append("\n");
		}
		else {
			sb.append(0).append("\n");
		}
	}
	
}