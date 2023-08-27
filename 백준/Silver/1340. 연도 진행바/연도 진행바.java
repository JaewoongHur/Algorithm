import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		s2 = s2.substring(0,s2.length()-1);
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		String[] t = s4.split(":");
		String s5 = t[0];
		String s6 = t[1];	
		
		int year = Integer.parseInt(s3);
		String month = s1;
		int day = Integer.parseInt(s2);
		int hour = Integer.parseInt(s5);
		int minute = Integer.parseInt(s6);
		
		boolean isLeapYear = false;
		if(year%400 == 0) {
			isLeapYear = true;
		}
		else {
			if(year%100 !=0) {
				if(year%4==0) {
					isLeapYear = true;
				}				
			}			
		}
		int td = 365;
		if(isLeapYear) {
			td++;
		}
		
		float total = td * 24 * 60;
		
		HashMap<String, Integer> m = new HashMap<>();
		m.put("January", 1);
		m.put("February",2);
		m.put("March", 3);
		m.put("April", 4);
		m.put("May", 5);
		m.put("June", 6);
		m.put("July", 7);
		m.put("August", 8);
		m.put("September", 9);
		m.put("October", 10);
		m.put("November", 11);
		m.put("December", 12);
		
		int[] mm = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		int curMonth = m.get(month);
		int curDay = 0;
		for(int i=0;i<curMonth;i++) {
			if(isLeapYear && i==2) {
				curDay +=29;
				continue;
			}
			curDay += mm[i];
		}
		curDay += day-1;
		
		int curTime = curDay*24*60;
		curTime += hour*60 + minute;
		curTime *= 100;
		double a = curTime;
		double b = total;
		System.out.println(a/b);
	}
}