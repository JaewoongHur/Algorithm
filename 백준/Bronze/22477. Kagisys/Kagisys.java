import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> list = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			list.add(br.readLine());
		}
		
		boolean state = false;
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0;i<m;i++) {
			String s = br.readLine();
			if(list.contains(s)) {
				if(state) {
					System.out.println("Closed by " + s);
				}else {
					System.out.println("Opened by " + s);
				}
				state = !state;
			}else {
				System.out.println("Unknown " + s);
			}
		}
		
	}
}
