package zw;

public class Solution2 {
    private static int N;
    private static int M;
    private static int max = 10000;
    private static int[] visit;
    private static int[][] distance;
    private static int[] bestmin;

    public static int Dijkstra() {
        visit[1] = 1;
        bestmin[1] = 0;
        for(int l = 2; l <= N; l++) {
            int temp = max;
            int k = -1;
            for(int i = 2; i <= N; i++) {
                if(visit[i] == 0 && distance[1][i] < temp) {
                    temp = distance[1][i];
                    k = i;
                }
            }
            visit[k] = 1;
            bestmin[k] = temp;
            for(int i = 2; i <= N; i++) {
                if(visit[i] == 0 && (distance[1][k] + distance[k][i]) < distance[1][i]) {
                    distance[1][i] = distance[1][k] + distance[k][i];
                }
            }
        }
        return bestmin[N];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while(T-->0) {
            N = input.nextInt();
            M = input.nextInt();
            bestmin = new int[N + 1];
            distance = new int[N + 1][N + 1];
            visit = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == j)
                        distance[i][j] = 0;
                    else
                        distance[i][j] = max;
                }
                bestmin[i] = max;
            }
            for (int i = 1; i <= M; i++) {
                int x = input.nextInt();
                int y = input.nextInt();
                distance[x][y] = 1;
            }
            input.close();
            int minLen = Dijkstra();
            if (minLen <= 2)
                System.out.println("POSSIBLE");
            else
                System.out.println("IMPOSSIBLE");
        }
    }
}
