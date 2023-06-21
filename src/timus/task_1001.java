package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class task_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> nums = new ArrayList<>();
        long p;
        try {
            while (in.hasNextLong()) {
                p = in.nextLong();
                nums.add(p);
            }
        } catch (Exception e) {
        } finally {
            in.close();
        }
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f", Math.sqrt((double) nums.get(i)));
            System.out.println();
        }
    }
}
