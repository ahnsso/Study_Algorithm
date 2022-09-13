import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        sb.append(a+b+"\n");
        sb.append(a-b+"\n");
        sb.append(a*b+"\n");
        sb.append(a/b+"\n");
        sb.append(a%b);
        
        System.out.println(sb);
        
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(a+b);
        sb.append('\n');
        sb.append(a-b);
        sb.append('\n');
        sb.append(a*b);
        sb.append('\n');
        sb.append(a/b);
        sb.append('\n');
        sb.append(a%b);
        
        System.out.println(sb);
        */
    }
}
