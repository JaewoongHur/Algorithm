import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		double[][] map = new double[16][3];

		for (int i = 0; i < 16; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				map[i][j] = Double.parseDouble(st.nextToken());
			}
		}

		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("-1 -1 -1")) {
				break;
			}
			
			double min = 255*255*3;
			
			int t = 0;
			
			st = new StringTokenizer(s);
			
			double r = Double.parseDouble(st.nextToken());
			double g = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			
			for(int i=0;i<16;i++) {
				double d = Math.sqrt((r-map[i][0])*(r-map[i][0])+(g-map[i][1])*(g-map[i][1])+(b-map[i][2])*(b-map[i][2]));
				
				if(min > d) {
					min = d;
					t = i;
				}
			}
			
			System.out.println("("+ (int)r +"," + (int)g + "," + (int)b + ") maps to (" + (int)map[t][0] +"," + (int)map[t][1] +","+ (int)map[t][2] +")");
		}
		
	}
}