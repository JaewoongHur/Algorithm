import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		long time = 0;
		
		if(s>=2*w) {
			time = (x + y)*w;
		}else if(s<2*w && s>w) {
			time = Math.min(x, y)*s + Math.abs(x-y)*w;
		}else {
			if(Math.abs(x-y)%2==0) {
				time = (Math.min(x, y)+Math.abs(x-y))*s;
			}else {
				time = (Math.min(x, y)+Math.abs(x-y)-1)*s + w;
			}
		}
		
		System.out.println(time);
	
	}
}