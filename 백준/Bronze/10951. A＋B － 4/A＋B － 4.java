import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.BufferedWriter;
 import java.io.OutputStreamWriter;
 import java.io.IOException;
 import java.util.StringTokenizer;

 public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer st;
         String input="";

         while((input=br.readLine())!=null && !input.isEmpty()) {
             st = new StringTokenizer(input," ");
             int A = Integer.parseInt(st.nextToken());
             int B = Integer.parseInt(st.nextToken());
             
             bw.write((A+B)+"\n");
         }
         bw.flush();
         bw.close();
     }
 }