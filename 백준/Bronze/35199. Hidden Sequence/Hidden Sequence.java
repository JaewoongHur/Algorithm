import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		int n = (a.length()+b.length()+c.length())/2;
		
		int i1=0; int i2=0; int i3=0;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int c1=0; int c2=0; int c3=0;
			
			if(i1<a.length()) {
				if(a.charAt(i1)=='1') {
					c1++;
				}else if(a.charAt(i1)=='2') {
					c2++;
				}else {
					c3++;
				}
			}
			
			if(i2<b.length()) {
				if(b.charAt(i2)=='1') {
					c1++;
				}else if(b.charAt(i2)=='2') {
					c2++;
				}else {
					c3++;
				}
			}
			
			if(i3<c.length()) {
				if(c.charAt(i3)=='1') {
					c1++;
				}else if(c.charAt(i3)=='2'){
					c2++;
				}else {
					c3++;
				}
			}
			
			if(c1==2) {
				i2++; i3++;
				sb.append(1);
			}else if(c2==2) {
				i1++; i3++;
				sb.append(2);
			}else {
				i1++; i2++;
				sb.append(3);
			}
			
		}
		
		System.out.println(sb);
		
	}
}
