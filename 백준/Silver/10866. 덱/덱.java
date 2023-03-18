import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int front = 10000;
	static int rear = 10000;
	static int size = 0;
	static int[] deque = new int[20001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			String[] s = br.readLine().split(" ");
			
			switch(s[0]) {
			case "push_front":
				push_front(Integer.parseInt(s[1]));
				break;
			case "push_back":
				push_back(Integer.parseInt(s[1]));
				break;
			case "pop_front":
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back":
				sb.append(pop_back()).append("\n");
				break;
			case "size":
				sb.append(size).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "front":
				if(size == 0) {
					sb.append(-1).append("\n");
				}
				else {
				sb.append(deque[front+1]).append("\n");
				}
				break;
			case "back":
				if(size == 0) {
					sb.append(-1).append("\n");
				}
				else {
				sb.append(deque[rear]).append("\n");
				}
				break;
			}
		}
		System.out.println(sb);		
	}
	static void push_front(int val) {
		deque[front] = val;
		front--;
		size++;
		
	}
	static void push_back(int val) {
		rear++;
		deque[rear] = val;
		size++;
	}
	static int pop_front() {
		if(size==0) {
			return -1;
		}
		int num = deque[front+1];
		front++;
		size--;
		return num;		
	}
	static int pop_back() {
		if(size==0) {
			return -1;
		}
		int num = deque[rear];
		rear--;
		size--;
		return num;
	}
	static int empty() {
		if(size == 0) {
			return 1;
		}
		return 0;
	}
}