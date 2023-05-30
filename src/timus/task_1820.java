package timus;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int n,k;
        int time=0;
        n=in.nextInt();
        k=in.nextInt();
        in.close();
        if (n%k==0){
        time = (n/k)*2;
        }
        else if (n<=k){
            time = 2;
        }
        else if(n%k <= k/2 && n%k >0){
           time = ((n/k)+1)*2-1; }
        else if(n%k > k/2){
            time = ((n/k)+1)*2;
        }

        System.out.print(time);

        out.flush();
    }
}
