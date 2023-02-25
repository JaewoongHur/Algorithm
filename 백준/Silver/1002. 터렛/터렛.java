import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			Double x1 = Double.parseDouble(st.nextToken());
			Double y1 = Double.parseDouble(st.nextToken());
			Double r1 = Double.parseDouble(st.nextToken());
			Double x2 = Double.parseDouble(st.nextToken());
			Double y2 = Double.parseDouble(st.nextToken());
			Double r2 = Double.parseDouble(st.nextToken());

			Double cd = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
			Double rd = Math.abs(r1-r2);
			
			StringBuilder sb = new StringBuilder();
			
			if(cd == 0) {
				if(rd == 0) {
					sb.append(-1+"\n");					
				}
				else {
					sb.append(0+"\n");
				}
			}
			else {
				if(r1>r2+cd) {
					sb.append(0+"\n");					
				}
				else if(r2>r1+cd) {
					sb.append(0+"\n");					
				}
				else if(r1==r2+cd) {
					sb.append(1+"\n");
				}
				else if(r2 == r1+cd) {
					sb.append(1+"\n");
				}
				else {
					if(r1+r2>cd) {
						sb.append(2+"\n");
					}
					else if(r1+r2==cd) {
						sb.append(1+"\n");
					}
					else {
						sb.append(0+"\n");
					}
				}
			}
			System.out.print(sb);
		}
	}
}