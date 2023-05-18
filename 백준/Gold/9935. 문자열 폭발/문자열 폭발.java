import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		String exp = br.readLine();
		
		int len = exp.length();
		char last = exp.charAt(len-1);
		
		
		Stack<Character> st = new Stack<>();
		Stack<Character> tmp = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			st.push(c);
			if(st.size()>=len && c==last) {
				int idx = len-1;
				for(int j=0;j<len;j++) {
					char a = st.pop();
					if(a==exp.charAt(idx)) {
						tmp.push(a);
					}
					else {
						st.push(a);
						while(!tmp.isEmpty()) {
							st.push(tmp.pop());	
						}
						break;
					}
					idx--;
				}
				if(idx==-1) {
					while(!tmp.isEmpty()) {
						tmp.pop();
					}
				}
			}
		}
		
		if(st.isEmpty()) {
			System.out.println("FRULA");
		}
		else {
			while(!st.isEmpty()) {
				sb.append(st.pop());
				
			}
		}
		System.out.println(sb.reverse().toString());
	}
}