import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = s.length();
		
		int ha = 0;
		int boooo = 0;
		int bravo = 0;
		
		for(int i=0;i<n-1;i++) {
			if(s.charAt(i)=='h' && s.charAt(i+1)=='a') {
				ha++;
			}
		}
		
		for(int i=0;i<n-4;i++) {
			if(s.charAt(i)=='b' && s.charAt(i+1)=='o'&& s.charAt(i+2)=='o'&& s.charAt(i+3)=='o'&& s.charAt(i+4)=='o') {
				boooo++;
			}
		}
		
		for(int i=0;i<n-4;i++) {
			if(s.charAt(i)=='b' && s.charAt(i+1)=='r'&& s.charAt(i+2)=='a'&& s.charAt(i+3)=='v'&& s.charAt(i+4)=='o') {
				bravo++;
			}
		}
		
		System.out.println(ha - boooo + 3*bravo);
	}
}
