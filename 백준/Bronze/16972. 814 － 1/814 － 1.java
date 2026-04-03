import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<34;i++) {
			for(int j=0;j<24;j++) {
				if((i==33 && j == 23)||(i==32 && j == 23)||(i==33&&j==22)) continue;
				int x = 203*i+416*j-8127;
				int y = 363*i -5982;
				sb.append(x + " " + y).append('\n');
			}
		}
		sb.append(-8140).append(' ').append(-6397);
		
		System.out.println(sb);
	}
}
