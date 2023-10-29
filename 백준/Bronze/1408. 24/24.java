import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		
		int h1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int s1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(),":");
		int h2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
	
		int gap = (h2-h1)*60*60 + (m2-m1)*60 + s2-s1;
		
		if(gap < 0) {
			h2+=24;
			gap = (h2-h1)*60*60 + (m2-m1)*60 + s2-s1;
		}
		
		int h = gap/3600;
		
		gap -= h *3600;
		
		int m = gap/60;
		
		gap -= m*60;
		
		int s = gap;
		
		StringBuilder sb = new StringBuilder();
		
		if(h<10) {
			sb.append('0').append(h);
		}
		else if(h>=10){
			sb.append(h);
		}
		
		sb.append(':');
		
		if(m<10) {
			sb.append('0').append(m);
		}
		else if(m>=10){
			sb.append(m);
		}
		sb.append(':');
		if(s<10) {
			sb.append('0').append(s);
		}
		else if(s>=10){
			sb.append(s);
		}
		
		System.out.println(sb);
	}
}