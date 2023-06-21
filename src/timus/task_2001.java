package timus;

import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int first, second;
        int [] CalcArray = new int[6];
for (int i=0; i<6;i++){
    CalcArray[i]=in.nextInt();
}
        in.close();
    first = CalcArray[0]-CalcArray[4];
    second = CalcArray[1]-CalcArray[3];

        System.out.print(first+" "+second);
    }
}
