import java.util.*;

public class t8_Rat_in_maze_deak_gfg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        Solution solution = new Solution();
        List<String> paths = solution.findPath(mat);

        System.out.println("Possible paths:");
        for (String path : paths) {
            System.out.println(path);
        }

        scanner.close();
    }
}

class Solution {
    public void backtrack(List<String> str, String s, int sr, int sc, int er, int ec, int[][] mat) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec || mat[sr][sc] == 0) {
            return;
        }
        if (sr == er && sc == ec) {
            str.add(s);
            return;
        }
        mat[sr][sc] = -1;

        // go to left
        if (sc - 1 >= 0 && mat[sr][sc - 1] == 1)
            backtrack(str, s + "L", sr, sc - 1, er, ec, mat);
      
        // go to right
        if (sc + 1 <= ec && mat[sr][sc + 1] == 1)
            backtrack(str, s + "R", sr, sc + 1, er, ec, mat);
      
        // go to up
        if (sr - 1 >= 0 && mat[sr - 1][sc] == 1)
            backtrack(str, s + "U", sr - 1, sc, er, ec, mat);
      
        // go to down
        if (sr + 1 <= er && mat[sr + 1][sc] == 1)
            backtrack(str, s + "D", sr + 1, sc, er, ec, mat);

        // actual backtrack
        mat[sr][sc] = 1;
    }

    public List<String> findPath(int[][] mat) {
        List<String> str = new ArrayList<>();
        String s = "";
        
        int sr = 0;
        int sc = 0;
        int er = mat.length - 1;
        int ec = mat[0].length - 1;

        // Check if start or end are blocked
        if (mat[sr][sc] == 0 || mat[er][ec] == 0) {
            return str;
        }
        
        backtrack(str, s, sr, sc, er, ec, mat);
         
        Collections.sort(str);
        return str;
    }
}
