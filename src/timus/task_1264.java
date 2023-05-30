package timus;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int N,M;
        N=in.nextInt();
        M=in.nextInt();
        in.close();
        int time = N*(M+1);

        System.out.print(time);
        out.flush();
    }
}
