import java.io.*;
import java.util.StringTokenizer;

public class q_11021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=1; i<count+1; i++){
            st = new StringTokenizer(br.readLine());
            bw.write("Case #"+i+": "+String.valueOf(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
            bw.newLine();
        }
        br.close();

        bw.flush();
        bw.close();

    }
}