package timus;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_1924 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int a;
        a = in.nextInt();
        in.close();
        int sum = 0;
        for (int i = 1; i<=a;i++){sum +=i;}
        int t = sum%2;
        String res;
        if (t==0){
            res = "black";
        }
        else{
            res = "grimy";
        }

        System.out.println(res);
        out.flush();
    }
}
