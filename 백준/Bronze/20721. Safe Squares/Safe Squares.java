import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] board = new char[8][8];
		
		for(int i=0;i<8;i++) {
			String s = br.readLine();
			for(int j=0;j<8;j++) {
				board[i][j] = s.charAt(j);				
			}
		}
		
		boolean[][] check = new boolean[8][8];
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(board[i][j] == 'R') {
					for(int k=0;k<8;k++) {
						if(check[i][k]) continue;
						check[i][k] = true;
					}
					for(int k=0;k<8;k++) {
						if(check[k][j]) continue;
						check[k][j] = true;
					}
				}
			}
		}
		
		int pawn = 0;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(!check[i][j]) pawn++;
			}
		}
		System.out.println(pawn);
	}
}