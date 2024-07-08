import java.util.Scanner;
public class rat_in_dead_maze_2 {
    // qn. 5th
    // here we use backtracking when we use four direction
// this qn. given general rat in maze in which rat can move   down and right    , left and upward    which
// makes this question normal recursion qn. but trick is here is some block are dead
    // means you are not allow to enter that block means consider as dead end

    // here 0 means dead end and 1 means you can enter the matrix

    // here space complexity is very high O(N*M)
    public static void print(int sr, int sc , int er, int ec, String s,int[][]maze, boolean[][]isvisited){
        if(sr<0 || sc<0){
            return ;
        }
        if(sr > er || sc >ec){
            return ;
        }
        if(sr == er && sc == ec ){
            System.out.println(s);
            return ;
        }
        if(maze[sr][sc]==0){
            return;
        }
        if(isvisited[sr][sc]==true){
            return;
        }
        isvisited[sr][sc]=true;

        // for down way
        print(sr+1,sc,er,ec,s+"D",maze,isvisited);
        // for right way
        print(sr,sc+1,er,ec,s+"R",maze,isvisited);

        // for left way
        print(sr,sc-1,er,ec,s+"l",maze, isvisited);
        // for up way
        print(sr-1,sc,er,ec,s+"U",maze, isvisited);

        isvisited[sr][sc]=false ;  // final optimisation
    }
    public static void main(String[] args) {

        //   user input
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows: ");
//        int rows = scanner.nextInt();
//
//        System.out.print("Enter the number of columns: ");
//        int columns = scanner.nextInt();
//
//        // Create a 2D maze with the specified number of rows and columns
//        int[][] maze = new int[rows][columns];
//
//        // Prompt the user to enter elements for the 2D maze
//        System.out.println("Enter the elements of the maze:");
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
//                maze[i][j] = scanner.nextInt();
//            }
//        }
//
//        // Display the entered 2D maze
//        System.out.println("Entered 2D maze:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(maze[i][j] + " ");
//            }
//            System.out.println();
//        }
        // hard coded
//        int rows =4;
//        int columns = 6;
//        boolean [][] isvisited = new boolean [rows][columns] ;
//        int[][] maze = {{1,0,1,1,1,1},  // 0 means  not allowed area  1 means allowed area
//                        {1,1,1,1,0,1},
//                        {0,1,1,1,1,1},
//                        {0,0,1,0,1,1}};
        int rows =3;
        int columns = 4;
        boolean [][] isvisited = new boolean [rows][columns] ;
        int[][] maze = {{1,0,1,1},  // 0 means  not allowed area  1 means allowed area
                        {1,1,1,1},
                        {1,1,0,1}};

        print(0, 0,rows-1,columns-1,"", maze,isvisited);

    }
}
