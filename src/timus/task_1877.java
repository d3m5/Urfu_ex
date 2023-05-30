package timus;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int first, second;
        String Answer = "no";
        first=in.nextInt();
        second=in.nextInt();
        in.close();
        if(first%2==0||second%2!=0){Answer="yes";}

        System.out.print(Answer);
        out.flush();
    }
}
