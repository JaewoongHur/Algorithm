import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;	
		while((s=br.readLine())!=null) {
			int n = Integer.parseInt(s);
			int m = (int) Math.pow(3, n);
			char[] c = new char[m];
			for(int i=0;i<m;i++) {
				c[i] = '-';
			}
			contour(0,m,c);
			
			for(int i=0;i<m;i++) {
				bw.write(c[i]);
			}
			bw.newLine();;
		}
		bw.flush();
		bw.close();
	}
	
	static void contour(int start, int m,char[] c) {
		if(m<3) {
			return;
		}
			for(int i=start+m/3;i<start+2*m/3;i++) {
				c[i] = ' ';
			}

		contour(start,m/3,c);
		contour(start+2*m/3,m/3,c);
	}	
}