package timus;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_2066 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int a,b,c;
        int sumMin =0;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        in.close();
        if(b==0) {sumMin = a*b-c;}
        else if(b==1){sumMin = a-b-c;}
        else if (b>0){
        sumMin = a-b*c;}

        System.out.print(sumMin);

        out.flush();
    }
}
