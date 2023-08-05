import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		String path ="";
		int  N = Integer.parseInt(s[0]);
		if(s.length>1) {
			path = s[1];
		}
		
		int root = (int) Math.pow(2, N+1)-1;
		
		if(N==30) {
			root = Integer.MAX_VALUE;
		}
		
		int idx = 1;
		
		if(path.length()>=1) {
			
			for(int i=0;i<path.length();i++) {
				idx = path.charAt(i)=='L' ? idx * 2: idx*2+1;
			}
		}
		System.out.println(root - idx + 1);
		
	
	}
}