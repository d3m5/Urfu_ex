package timus;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int first, second;
        int [] CalcArray = new int[6];
for (int i=0; i<6;i++){
    CalcArray[i]=in.nextInt();
}
        in.close();
    first = CalcArray[0]-CalcArray[4];
    second = CalcArray[1]-CalcArray[3];

        System.out.print(first+" "+second);
        out.flush();
    }
}
