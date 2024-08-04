
import java.util.*;

public class t9_N_Queens {

        public static void main(String[] args) {
            int n =5;
            char [][] board = new char [n][n];
            for(int i =0; i< n; i++){
                for(int j =0; j< n; j++) {
                    board[i][j] = '.';
                }
            }
            System.out.println("Original array");
            for(int i =0; i< n; i++){
                for(int j =0; j< n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("After putting N-queens :");
            nqueen(board,0);
        }
    
        private static void nqueen(char[][] board, int row) {
            int n = board.length;
    
            if(row == n){
                for(int i =0; i< n; i++){
                    for(int j =0; j< n; j++) {
                       System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }
            for(int j =0; j< n; j++){
                if(isSafe(board,row,j)){
                    board[row][j]='Q';
                    nqueen(board,row+1);
                    board[row][j]='.';   // backtrack
                }
            }
        }
    
        private static boolean isSafe(char[][] board, int row, int col) {
            int n = board.length;
            // left to right
            for(int j =0; j<n; j++){
                if(board[row][j]=='Q'){
                    return false;
                }
            }
            // up to bottom
            for(int i =0; i<n; i++){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
    
            int i= row;
            int j =col ;
            // northeast
            while(i>=0 && j<n){
                if(board[i][j]=='Q'){
                    return false;
                }
              i--;
                j++;
            }
    
             i= row;
             j =col ;
            // north-west
            while(i>=0 && j>=0){
                if(board[i][j]=='Q'){
                    return false;
                }
                i--;
                j--;
            }
    
            i= row;
            j =col ;
            // south-east
            while(i<n && j<n){
                if(board[i][j]=='Q'){
                    return false;
                }
                i++;
                j++;
            }
            i= row;
            j =col ;
            // south-west
            while(i<n && j>=0){
                if(board[i][j]=='Q'){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
    

