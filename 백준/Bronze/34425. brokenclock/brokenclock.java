import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		boolean[][] pos = new boolean[6][10];

		boolean[][] digit = new boolean[10][7];

		char[][] map = new char[6][7];

		digit[0] = new boolean[] {true,true,true,false,true,true,true};
		digit[1] = new boolean[] {false,false,true,false,false,true,false};
		digit[2] = new boolean[] {true,false,true,true,true,false,true};
		digit[3] = new boolean[] {true,false,true,true,false,true,true};
		digit[4] = new boolean[] {false,true,true,true,false,true,false};
		digit[5] = new boolean[] {true,true,false,true,false,true,true};
		digit[6] = new boolean[] {true,true,false,true,true,true,true};
		digit[7] = new boolean[] {true,false,true,false,false,true,false};
		digit[8] = new boolean[] {true,true,true,true,true,true,true};
		digit[9] = new boolean[] {true,true,true,true,false,true,false};
				
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<6;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<7;j++) {
				map[i][j] = st.nextToken().charAt(0);
			}
		}
		
		for(int i=0;i<6;i++) {
			out: for(int j=0;j<10;j++) {
				for(int k=0;k<7;k++) {
					if(map[i][k]=='-')continue;
					
					if(map[i][k] == '0' && digit[j][k]) continue out;
					
					if(map[i][k] == '1' && !digit[j][k]) continue out;
				}
				pos[i][j] = true;
			}
		}
		
		
		for(int d1=0;d1<3;d1++) {
			if(!pos[0][d1]) continue;
			for(int d2=0;d2<10;d2++) {
				if(!pos[1][d2]) continue;
				if(d1==2 && d2>=4) continue; 
				for(int d3=0;d3<6;d3++) {
					if(!pos[2][d3]) continue;
					for(int d4=0;d4<10;d4++) {
						if(!pos[3][d4]) continue;
						for(int d5=0;d5<6;d5++) {
							if(!pos[4][d5]) continue;
							for(int d6=0;d6<10;d6++) {
								if(!pos[5][d6]) continue;
									sb.append(d1).append(d2).append(':').append(d3).append(d4).append(':').append(d5).append(d6).append('\n');
								}
							}
						}
					}
				}
			}
		
		System.out.println(sb);

	}
}