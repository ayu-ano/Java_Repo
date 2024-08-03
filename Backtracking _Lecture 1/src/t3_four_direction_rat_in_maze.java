public class t3_four_direction_rat_in_maze {
   // move the rat i all four direction
    // little implementation of backtracking
    // 3rd
    public static void print(int sr, int sc , int er, int ec, String s,boolean [][] visited){
        if(sr<0 || sc<0){
            return ;
        }
        if(sr > er || sc >ec){
            return ;
        }
        if(visited[sr][sc]==true){
            return;
        }
        if(sr == er && sc == ec ){
            System.out.println(s);
            return ;
        }
        visited[sr][sc]=true; // 2nd optimisation without final optimisation
        // for down way
        print(sr+1,sc,er,ec,s+"D",visited);
        // for right way
        print(sr,sc+1,er,ec,s+"R",visited);
        // for left way
        print(sr,sc-1,er,ec,s+"l", visited);
        // for up way
        print(sr-1,sc,er,ec,s+"U", visited);
        visited[sr][sc]=false ;  // final optimisation
    }


    public static void main(String[] args) {
        int rows =3;
        int columns = 3;
        boolean [][] visited = new boolean [rows][columns] ;  // during initialisation by default all values is false
        print(0, 0,rows-1,columns-1,"",visited);

    }
}


// note in first try we find error that it give infinite loop
// because we are not using back tracking for that we take
// array_2d to take true the path we visited

// in this 2nd approach we have set the 2d array as false; for to do the correct backtracking
// without that we get the wrong answer


// public class four_direction_rat_in_maze {
//    // move the rat i all four direction
//    public static void print(int sr, int sc , int er, int ec, String s){
//        if(sr<0 || sc<0){
//            return ;
//        }
//        if(sr > er || sc >ec){
//            return ;
//        }
//        if(sr == er && sc == ec ){
//            System.out.println(s);
//            return ;
//        }
//        // for down way
//        print(sr+1,sc,er,ec,s+"D");
//        // for right way
//        print(sr,sc+1,er,ec,s+"R");
//        // for left way
//        print(sr,sc-1,er,ec,s+"l");
//        // for up way
//        print(sr-1,sc,er,ec,s+"U");
//    }
//    public static void main(String[] args) {
//        int rows =3;
//        int columns = 3;
//        print(0, 0,rows-1,columns-1,"");
//
//    }
//}