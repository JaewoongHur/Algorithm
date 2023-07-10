import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s;
        while((s=br.readLine())!=null){
            st = new StringTokenizer(s);
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());

            if(a>0 && b>0){
                System.out.println("Q1");
            }
            else if(a<0 && b>0){
                System.out.println("Q2");
            }
            else if(a<0 && b<0){
                System.out.println("Q3");
            }
            else if(a>0 && b<0){
                System.out.println("Q4");
            }
            else{
                System.out.println("AXIS");
            }

            if(a==0 && b==0){
                break;
            }

        }

    }
}