public class print_path_rat_in_maze {
    // yai proper recursion tha
    //2nd
    public static void print(int sr, int sc , int er, int ec, String s){
        if(sr > er || sc >ec){
            return ;
        }
        if(sr == er && sc == ec ){
            System.out.println(s);
            return ;
        }
        // for down way
        print(sr+1,sc,er,ec,s+"D");
        // for right way
        print(sr,sc+1,er,ec,s+"R");
    }
    public static void main(String[] args) {
        int rows =3;
        int columns = 3;
        print(1, 1,rows,columns,"");

    }
}
