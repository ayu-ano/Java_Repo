
import java.util.*;
// parent class
abstract class Floyd_Warshall{
    public int size;
    public Floyd_Warshall(int size){
        this.size=size;
    }
    //method for floyd algorithm
    public void floyd(int [][] cost,int src,int destination){

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    //here we comparing the each value of source to destination  and find the minimum value
                    if (cost[i][k] != Integer.MAX_VALUE && cost[k][j] != Integer.MAX_VALUE &&
                            cost[i][k] + cost[k][j] < cost[i][j]) {
                        cost[i][j] = cost [i][k] + cost [k][j];
                    }
                }
            }
        }

    }
}
// shortestPath is subclass or chid class of Floyd_warshall
class shortestPath extends Floyd_Warshall{
 public shortestPath(int K){
     super(K);
 }
 public void print(int [][]cost){
     for (int i = 0; i < cost.length; i++) {
         for (int j = 0; j < cost.length; j++) {
             System.out.println("source city : "+" " + i +" " +"destination city :"+ " "+ j +" " + "cost will be :"+" "+ cost[i][j]);
         }
     }
 }
}

public class Assignment5_Ayush {

    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE; // initialize infinity value
        Scanner sc = new Scanner(System.in);

        // read input values
        System.out.println("Enter the no. of cities : ");
        int n = sc.nextInt();
        shortestPath fl=new shortestPath(n);
        int[][] cost = new int[n][n];
        System.out.println("Enter the Cost _ distance between two cities _adjacency matrix of :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
                if (cost[i][j] == -1) { // if there is a path having -1 value it means that there is no such path exist b/w till now
                    cost[i][j] = INF; // replace -1 with infinity value
                }
            }
        }
        System.out.println();
        System.out.println("Enter the source city :");
        int source = sc.nextInt();
        System.out.println("Enter the destination city :");
        int destination = sc.nextInt();

        // run Floyd Warshall algorithm
        fl.floyd(cost,source,destination);
        // print the shortest distance between all pairs of vertices
        System.out.println("Shortest distance between all pairs of vertices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cost[i][j] == Integer.MAX_VALUE) {
                System.out.print("INF ");
                }
                else{
                    System.out.print(cost[i][j] + " ");
                }
            }
            System.out.println();
        }
      fl.print(cost);
        System.out.println();


        // print minimum cost to reach destination city from source city
        if (cost[source][destination] == INF) {
            System.out.println("No path found!");
        } else {
            System.out.println("Minimum cost from city " + source + " to city " + destination + " is " + cost [source][destination]);
        }
    }
}

// here I am using the abstraction ,encapsulation ,inheritance





