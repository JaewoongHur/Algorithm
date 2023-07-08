import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int tc=1;tc<=T;tc++){
            char[][][] arr = new char[6][3][3];

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[0][i][j] = 'w';
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[1][i][j] = 'y';
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[2][i][j] = 'r';
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[3][i][j] = 'o';
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[4][i][j] = 'g';
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[5][i][j] = 'b';
                }
            }

            int n = Integer.parseInt(br.readLine());
            char[] rot = new char[2*n+1];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int i=1;i<=n;i++){
                String s = st.nextToken();
                rot[2*i-1] = s.charAt(0);
                rot[2*i] = s.charAt(1);
            }
            char[] tmp = new char[3];
            char[] t = new char[9];
            for(int k=1;k<=n;k++){
                if(rot[2*k-1]=='U'&& rot[2*k]=='+'){
                    tmp[0] = arr[2][0][0]; tmp[1] = arr[2][0][1]; tmp[2] = arr[2][0][2];
                    arr[2][0][0] = arr[5][0][0]; arr[2][0][1] = arr[5][0][1]; arr[2][0][2] = arr[5][0][2];
                    arr[5][0][0] = arr[3][0][0]; arr[5][0][1] = arr[3][0][1]; arr[5][0][2] = arr[3][0][2];
                    arr[3][0][0] = arr[4][0][0]; arr[3][0][1] = arr[4][0][1]; arr[3][0][2] = arr[4][0][2];
                    arr[4][0][0] = tmp[0]; arr[4][0][1] = tmp[1]; arr[4][0][2] = tmp[2];
                    
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[0][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=2;i>=0;i--) {
                    	for(int j=0;j<3;j++) {
                    		arr[0][j][i] = t[c];
                    		c++;
                    	}
                    }
                    
                }
                else if(rot[2*k-1]=='U'&& rot[2*k]=='-') {
                    tmp[0] = arr[2][0][0];tmp[1] = arr[2][0][1];tmp[2] = arr[2][0][2];
                    arr[2][0][0] = arr[4][0][0];arr[2][0][1] = arr[4][0][1];arr[2][0][2] = arr[4][0][2];
                    arr[4][0][0] = arr[3][0][0];arr[4][0][1] = arr[3][0][1];arr[4][0][2] = arr[3][0][2];
                    arr[3][0][0] = arr[5][0][0];arr[3][0][1] = arr[5][0][1];arr[3][0][2] = arr[5][0][2];
                    arr[5][0][0] = tmp[0];arr[5][0][1] = tmp[1];arr[5][0][2] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[0][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=0;i<3;i++) {
                    	for(int j=2;j>=0;j--) {
                    		arr[0][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='D'&& rot[2*k]=='+'){
                    tmp[0] = arr[2][2][0]; tmp[1] = arr[2][2][1]; tmp[2] = arr[2][2][2];
                    arr[2][2][0] = arr[4][2][0]; arr[2][2][1] = arr[4][2][1]; arr[2][2][2] = arr[4][2][2];
                    arr[4][2][0] = arr[3][2][0]; arr[4][2][1] = arr[3][2][1]; arr[4][2][2] = arr[3][2][2];
                    arr[3][2][0] = arr[5][2][0]; arr[3][2][1] = arr[5][2][1]; arr[3][2][2] = arr[5][2][2];
                    arr[5][2][0] = tmp[0]; arr[5][2][1] = tmp[1]; arr[5][2][2] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[1][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=2;i>=0;i--) {
                    	for(int j=0;j<3;j++) {
                    		arr[1][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='D'&& rot[2*k]=='-'){
                    tmp[0] = arr[2][2][0]; tmp[1] = arr[2][2][1]; tmp[2] = arr[2][2][2];
                    arr[2][2][0] = arr[5][2][0]; arr[2][2][1] = arr[5][2][1]; arr[2][2][2] = arr[5][2][2];
                    arr[5][2][0] = arr[3][2][0]; arr[5][2][1] = arr[3][2][1]; arr[5][2][2] = arr[3][2][2];
                    arr[3][2][0] = arr[4][2][0]; arr[3][2][1] = arr[4][2][1]; arr[3][2][2] = arr[4][2][2];
                    arr[4][2][0] = tmp[0]; arr[4][2][1] = tmp[1]; arr[4][2][2] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[1][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=0;i<3;i++) {
                    	for(int j=2;j>=0;j--) {
                    		arr[1][j][i] = t[c];
                    		c++;
                    	}
                    }
                }

                else if(rot[2*k-1]=='F'&& rot[2*k]=='+'){
                    tmp[0] = arr[0][2][0]; tmp[1] = arr[0][2][1]; tmp[2] = arr[0][2][2];
                    arr[0][2][0] = arr[4][2][2]; arr[0][2][1] = arr[4][1][2]; arr[0][2][2] = arr[4][0][2];
                    arr[4][2][2] = arr[1][0][2]; arr[4][1][2] = arr[1][0][1]; arr[4][0][2] = arr[1][0][0];
                    arr[1][0][2] = arr[5][0][0]; arr[1][0][1] = arr[5][1][0]; arr[1][0][0] = arr[5][2][0];
                    arr[5][0][0] = tmp[0]; arr[5][1][0] = tmp[1]; arr[5][2][0] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[2][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=2;i>=0;i--) {
                    	for(int j=0;j<3;j++) {
                    		arr[2][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='F'&& rot[2*k]=='-'){
                    tmp[0] = arr[0][2][0]; tmp[1] = arr[0][2][1]; tmp[2] = arr[0][2][2];
                    arr[0][2][0] = arr[5][0][0]; arr[0][2][1] = arr[5][1][0]; arr[0][2][2] = arr[5][2][0];
                    arr[5][0][0] = arr[1][0][2]; arr[5][1][0] = arr[1][0][1]; arr[5][2][0] = arr[1][0][0];
                    arr[1][0][2] = arr[4][2][2]; arr[1][0][1] = arr[4][1][2]; arr[1][0][0] = arr[4][0][2];
                    arr[4][2][2] = tmp[0]; arr[4][1][2] = tmp[1]; arr[4][0][2] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[2][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=0;i<3;i++) {
                    	for(int j=2;j>=0;j--) {
                    		arr[2][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='B'&& rot[2*k]=='+'){
                    tmp[0] = arr[0][0][2]; tmp[1] = arr[0][0][1]; tmp[2] = arr[0][0][0];
                    arr[0][0][2] = arr[5][2][2]; arr[0][0][1] = arr[5][1][2]; arr[0][0][0] = arr[5][0][2];
                    arr[5][2][2] = arr[1][2][0]; arr[5][1][2] = arr[1][2][1]; arr[5][0][2] = arr[1][2][2];
                    arr[1][2][0] = arr[4][0][0]; arr[1][2][1] = arr[4][1][0]; arr[1][2][2] = arr[4][2][0];
                    arr[4][0][0] = tmp[0]; arr[4][1][0] = tmp[1]; arr[4][2][0] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[3][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=2;i>=0;i--) {
                    	for(int j=0;j<3;j++) {
                    		arr[3][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='B'&& rot[2*k]=='-'){
                    tmp[0] = arr[0][0][0]; tmp[1] = arr[0][0][1]; tmp[2] = arr[0][0][2];
                    arr[0][0][0] = arr[4][2][0]; arr[0][0][1] = arr[4][1][0]; arr[0][0][2] = arr[4][0][0];
                    arr[4][2][0] = arr[1][2][2]; arr[4][1][0] = arr[1][2][1]; arr[4][0][0] = arr[1][2][0];
                    arr[1][2][2] = arr[5][0][2]; arr[1][2][1] = arr[5][1][2]; arr[1][2][0] = arr[5][2][2];
                    arr[5][0][2] = tmp[0]; arr[5][1][2] = tmp[1]; arr[5][2][2] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[3][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=0;i<3;i++) {
                    	for(int j=2;j>=0;j--) {
                    		arr[3][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='L'&& rot[2*k]=='+'){
                    tmp[0] = arr[0][0][0]; tmp[1] = arr[0][1][0]; tmp[2] = arr[0][2][0];
                    arr[0][0][0] = arr[3][2][2]; arr[0][1][0] = arr[3][1][2]; arr[0][2][0] = arr[3][0][2];
                    arr[3][2][2] = arr[1][0][0]; arr[3][1][2] = arr[1][1][0]; arr[3][0][2] = arr[1][2][0];
                    arr[1][0][0] = arr[2][0][0]; arr[1][1][0] = arr[2][1][0]; arr[1][2][0] = arr[2][2][0];
                    arr[2][0][0] = tmp[0]; arr[2][1][0] = tmp[1]; arr[2][2][0] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[4][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=2;i>=0;i--) {
                    	for(int j=0;j<3;j++) {
                    		arr[4][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='L'&& rot[2*k]=='-'){
                    tmp[0] = arr[0][0][0]; tmp[1] = arr[0][1][0]; tmp[2] = arr[0][2][0];
                    arr[0][0][0] = arr[2][0][0]; arr[0][1][0] = arr[2][1][0]; arr[0][2][0] = arr[2][2][0];
                    arr[2][0][0] = arr[1][0][0]; arr[2][1][0] = arr[1][1][0]; arr[2][2][0] = arr[1][2][0];
                    arr[1][0][0] = arr[3][2][2]; arr[1][1][0] = arr[3][1][2]; arr[1][2][0] = arr[3][0][2];
                    arr[3][2][2] = tmp[0]; arr[3][1][2] = tmp[1]; arr[3][0][2] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[4][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=0;i<3;i++) {
                    	for(int j=2;j>=0;j--) {
                    		arr[4][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='R'&& rot[2*k]=='+'){
                    tmp[0] = arr[0][2][2]; tmp[1] = arr[0][1][2]; tmp[2] = arr[0][0][2];
                    arr[0][2][2] = arr[2][2][2]; arr[0][1][2] = arr[2][1][2]; arr[0][0][2] = arr[2][0][2];
                    arr[2][2][2] = arr[1][2][2]; arr[2][1][2] = arr[1][1][2]; arr[2][0][2] = arr[1][0][2];
                    arr[1][2][2] = arr[3][0][0]; arr[1][1][2] = arr[3][1][0]; arr[1][0][2] = arr[3][2][0];
                    arr[3][0][0] = tmp[0]; arr[3][1][0] = tmp[1]; arr[3][2][0] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[5][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=2;i>=0;i--) {
                    	for(int j=0;j<3;j++) {
                    		arr[5][j][i] = t[c];
                    		c++;
                    	}
                    }
                }
                else if(rot[2*k-1]=='R'&& rot[2*k]=='-'){
                	tmp[0] = arr[0][2][2]; tmp[1] = arr[0][1][2]; tmp[2] = arr[0][0][2];
                    arr[0][2][2] = arr[3][0][0]; arr[0][1][2] = arr[3][1][0]; arr[0][0][2] = arr[3][2][0];
                    arr[3][0][0] = arr[1][2][2]; arr[3][1][0] = arr[1][1][2]; arr[3][2][0] = arr[1][0][2];
                    arr[1][2][2] = arr[2][2][2]; arr[1][1][2] = arr[2][1][2]; arr[1][0][2] = arr[2][0][2];
                    arr[2][2][2] = tmp[0]; arr[2][1][2] = tmp[1]; arr[2][0][2] = tmp[2];
                    int c = 0;
                    for(int i=0;i<3;i++) {
                    	for(int j=0;j<3;j++) {
                    		t[c] = arr[5][i][j];
                    		c++;
                    	}
                    }
                    c=0;
                    for(int i=0;i<3;i++) {
                    	for(int j=2;j>=0;j--) {
                    		arr[5][j][i] = t[c];
                    		c++;
                    	}
                    }
                }  
            }

            for(int i=0;i<3;i++) {
            	for(int j=0;j<3;j++) {
            		sb.append(arr[0][i][j]);
            	}
            	sb.append('\n');
            }
 
            }
        
        System.out.println(sb);
    }
}