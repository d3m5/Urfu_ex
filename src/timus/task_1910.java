package timus;

import java.io.IOException;
import java.util.Scanner;

public class task_1910 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int Size;
        int count = 2;
        Size = in.nextInt();
        int[] WallArray = new int[Size];
        for (int i = 0; i < Size; i++) {      WallArray[i] = in.nextInt();     }
        int sum = WallArray[0]+WallArray[1]+WallArray[2];
        for (int i = 2; i < (Size-1); i++) {
            int sumTemp = WallArray[(i-1)]+WallArray[i]+WallArray[(i+1)];
                if (sumTemp>sum){
                sum = sumTemp;
                count = i+1;
                    }
                }
        in.close();
        System.out.println(sum+" "+count);
    }
}
