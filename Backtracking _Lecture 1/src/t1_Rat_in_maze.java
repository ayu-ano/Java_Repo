public class t1_Rat_in_maze{
    // lecture cllg wallah 63
    // 1st
    // yai proper recursion tha
    public static int maze(int sr, int sc,int er, int ec){
        if(sr > er || sc >ec){
            return 0;
        }
        if(sr == er && sc == ec ){
            return 1;
        }
        int totalWays = 0;
        int downWay = maze(sr+1,sc,er,ec);
        int rightWay = maze(sr,sc+1,er,ec);
        totalWays = downWay + rightWay;
        return totalWays;
    }
    public static void main(String[] args) {
        int rows =3;
        int columns = 3;
        int val = maze(1, 1,rows,columns);
        System.out.println(val);

    }
}
