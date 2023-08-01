import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        boolean possible = true;
        int n = s.length();
        for(int i = 0; i<n;i++) {
            if (s.charAt(i) == 'X') {
                cnt++;
                continue;
            } else if (s.charAt(i) == '.') {
                if (cnt % 2 == 1) {
                    possible = false;
                    break;
                }
                cnt = 0;
            }
        }
            if(cnt%2==1){
                possible = false;
            }
            
        cnt = 0;
        if(possible){
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='X'){
                    cnt++;
                }
                else if(s.charAt(i)=='.'){
                    if(i>=1 && s.charAt(i-1)=='X') {
                        int a = cnt / 4;
                        for (int j = 0; j < a; j++) {
                            sb.append("AAAA");
                        }
                        if(cnt%4==2){
                            sb.append("BB");
                        }
                        sb.append('.');
                        cnt=0;
                    }
                    else{
                        sb.append('.');
                        cnt=0;
                    }
                }
            }

            if(cnt !=0){
                int a = cnt / 4;
                for (int j = 0; j < a; j++) {
                    sb.append("AAAA");
                }
                if(cnt%4==2){
                    sb.append("BB");
                }
            }
            System.out.println(sb);
        }
        else{
            System.out.println(-1);
        }

    }
}