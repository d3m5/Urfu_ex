package timus;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_1787 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int k,n,sum;
        sum = 0;
        k=in.nextInt();
        n=in.nextInt();
        int [] CarArray = new int [n];
        for (int i=0; i<n;i++){
            CarArray[i]=in.nextInt();
            sum += CarArray[i]-k;
            if (sum<0){
                sum=0;}
        }
        in.close();

        System.out.print(sum);

        out.flush();
    }
}
