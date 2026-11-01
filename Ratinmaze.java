import java.util.*;

class Solution {

    static boolean issafe(int[][] maze, int newx, int newy,
                          boolean[][] visited) {

        int n = maze.length;

        // Out of bounds
        if (newx < 0 || newx >= n || newy < 0 || newy >= n) {
            return false;
        }

        // Already visited
        if (visited[newx][newy]) {
            return false;
        }

        // Blocked cell
        if (maze[newx][newy] == 0) {
            return false;
        }

        return true;
    }

    static void solve(int[][] maze, int i, int j,
                      ArrayList<String> ans,
                      int lx, int ly, String path,
                      boolean[][] visited) {

        // Base case
        if (i == lx && j == ly) {
            ans.add(path);
            return;
        }

        visited[i][j] = true;

        // Move Up
        int upx = i - 1;
        int upy = j;

        if (issafe(maze, upx, upy, visited)) {
            solve(maze, upx, upy, ans, lx, ly,
                  path + "U", visited);
        }

        // Move Down
        int downx = i + 1;
        int downy = j;

        if (issafe(maze, downx, downy, visited)) {
            solve(maze, downx, downy, ans, lx, ly,
                  path + "D", visited);
        }

        // Move Left
        int leftx = i;
        int lefty = j - 1;

        if (issafe(maze, leftx, lefty, visited)) {
            solve(maze, leftx, lefty, ans, lx, ly,
                  path + "L", visited);
        }

        // Move Right
        int rightx = i;
        int righty = j + 1;

        if (issafe(maze, rightx, righty, visited)) {
            solve(maze, rightx, righty, ans, lx, ly,
                  path + "R", visited);
        }

        // Backtracking
        visited[i][j] = false;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length;

        ArrayList<String> ans = new ArrayList<>();

        boolean[][] visited = new boolean[n][n];

        int i = 0;
        int j = 0;

        int lx = n - 1;
        int ly = n - 1;

        String path = "";

        if (maze[0][0] == 0 || maze[lx][ly] == 0) {
            return ans;
        }

        solve(maze, i, j, ans, lx, ly, path, visited);

        Collections.sort(ans);

        return ans;
    }
}
