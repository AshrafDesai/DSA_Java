package Recursion;

public class rateinmaze {
    public static void RateInMaze(int m[][], int n, int srcx, int srcy, String path, boolean visited[][]) {
        if (srcx == n - 1 && srcy == n - 1)
        {
            System.out.println(path);
            return;
        }

        visited[srcx][srcy] = true;

        if (isSafe(srcx + 1, srcy, m, visited, n)) 
        {
            RateInMaze(m, n, srcx + 1, srcy, path + 'D', visited);
        }

        if (isSafe(srcx, srcy + 1, m, visited, n)) 
        {
            RateInMaze(m, n, srcx, srcy + 1, path + 'R', visited);
        }

        if (isSafe(srcx - 1, srcy, m, visited, n)) 
        {
            RateInMaze(m, n, srcx - 1, srcy, path + 'U', visited);
        }

        if (isSafe(srcx, srcy - 1, m, visited, n)) 
        {
            RateInMaze(m, n, srcx, srcy - 1, path + 'L', visited);
        }

        visited[srcx][srcy] = false;
    }

    public static boolean isSafe(int x, int y, int m[][], boolean visited[][], int n) 
    {
        return (x >= 0 && x < n && y >= 0 && y < n && m[x][y] == 1 && !visited[x][y]);
    }

    public static void main(String[] args) {
        int[][] m = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int n = m.length;
        boolean[][] visited = new boolean[n][n];
        RateInMaze(m, n, 0, 0, "", visited);
    }
}
