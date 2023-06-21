package timus;

import java.util.Scanner;

public class task_1004 {
    public static final int INF = 0x7ffffff;
    public static int dist[][] = new int[110][110];
    public static int pre[][] = new int[110][110];
    public static int w[][] = new int[110][110];
    public static int N, M, num;
    public static int minc;
    public static int path[] = new int[101];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            N = in.nextInt();
            if (N == -1) {
                break;
            }
            M = in.nextInt();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    dist[i][j] = w[i][j] = INF;
                    pre[i][j] = i;
                }
            }
            for (int i = 1; i <= M; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                int len = in.nextInt();
                if (dist[u][v] > len) {

                    w[u][v] = w[v][u] = dist[u][v] = dist[v][u] = len;
                }
            }
            floyd();

            if (minc == INF) {
                System.out.println("No solution.");
            } else {
                System.out.printf("%d", path[0]);
                for (int i = 1; i < num; i++) {
                    System.out.printf(" %d", path[i]);
                }
                System.out.println();
            }
        } while (true);
    }

    public static void floyd() {

        minc = INF;
        for (int k = 1; k <= N; k++) {

            for (int i = 1; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    int ans = dist[i][j] + w[i][k] + w[k][j];
                    if (ans < minc) {
                        minc = ans;
                        num = 0;
                        int p = j;
                        while (p != i) {
                            path[num++] = p;
                            p = pre[i][p];
                        }
                        path[num++] = i;
                        path[num++] = k;
                    }
                }
            }

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        pre[i][j] = pre[k][j];
                    }
                }
            }
        }
    }
}
