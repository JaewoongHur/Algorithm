import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int cnt = 0;
		
		String target = "certainly";
		int idx = 0;
		
		while((idx = s.indexOf(target, idx))!=-1) {
			cnt++;
			idx += target.length();		
		}
		
		System.out.println(cnt);
		
	}
}