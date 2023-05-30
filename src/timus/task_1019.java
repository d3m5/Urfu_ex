package timus;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class task_1019 {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    public static class Interval {
        public int x, y;

        public Interval(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        LinkedList<Interval> whites = new LinkedList<>();
        whites.add(new Interval(0, 1000000000));
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            char c = (char) sc.next().charAt(0);
            Interval k = new Interval(x, y);
            if (c == 'b') {
                ListIterator<Interval> iterator = whites.listIterator();
                while (iterator.hasNext()) {
                    Interval j = iterator.next();
                    if (k.x >= j.x && k.y <= j.y) {
                        Interval splitRight = new Interval(k.y, j.y);
                        if (j.x == k.x)
                            iterator.remove();
                        else {
                            j.y = k.x;
                        }
                        if (k.y != j.y)
                            iterator.add(splitRight);
                    } else if (k.x <= j.x && k.y >= j.y) {
                        iterator.remove();
                    } else if (k.x <= j.x && k.y >= j.x) {
                        j.x = k.y;
                    } else if (k.x <= j.y && k.y >= j.y) {
                        j.y = k.x;
                    }
                }
            } else {
                ListIterator<Interval> iterator = whites.listIterator();
                boolean outside = true;
                while (iterator.hasNext()) {
                    Interval j = iterator.next();
                    if (k.x >= j.x && k.y <= j.y) {
                        outside = false;
                    } else if (k.x <= j.x && k.y >= j.y) {
                        iterator.remove();
                    } else if (k.x < j.x && k.y >= j.x) {
                        outside = false;
                        j.x = k.x;
                        k.y = j.y;
                    } else if (k.x <= j.y && k.y > j.y) {
                        outside = false;
                        j.y = k.y;
                        k.x = j.x;
                    }
                }
                if (outside) {
                    whites.add(new Interval(k.x, k.y));
                }
            }
        }
        int xmax = whites.getFirst().x;
        int ymax = whites.getFirst().y;
        for (Interval w : whites) {
            if ((w.y - w.x) > (ymax - xmax)) {
                ymax = w.y;
                xmax = w.x;
            }
        }
        System.out.println(xmax + " " + ymax);
    }
}
