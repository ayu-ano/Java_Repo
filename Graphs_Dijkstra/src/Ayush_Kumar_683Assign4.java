import java.util.Scanner;
import java.util.*;
// Write a program to implement Dijkstra’s Shortest Path Algorithm. Input is an adjacency matrix.
// creating an abstract class  for distributing its  properties to their sub_class   adjacency matrix
// this  is our super class
abstract class Graph1 {
    protected int V;

    public Graph1(int V) {
        this.V = V;
    }
    // creating an abstract method in which passing the parameters like  2d array graph and source
    abstract public void dijkstra(int[][] graph,int src);
}
//  creating the sub_class   which can inherit of graph
class AdjacencyMatrixGraph1 extends Graph1 {

    public AdjacencyMatrixGraph1(int V) { // constructor of sub_class
        super(V);// calling the variables of super class.
    }

    // Creating the method for dijkstra algorithm in which passing the parameters like  2d array graph and source.
    public void dijkstra(int[][]graph,int src) {
        // storing the distance or weight of the graph
        int[] dist = new int[V];
        // storing the set of vertices have minimum possible path between the source or vertex connected to source
        // to its adjacency vertex.
        boolean[] shortestPathSet = new boolean[V];
        // Initialize all distances as INFINITE and stpSet[] as false

        for (int i = 0; i < V; i++) {
            // first assigning each index value to be maximum
            dist[i] = Integer.MAX_VALUE;
            // if  in that case distance is equal to maximum then in spt array will take false value
            shortestPathSet [i] = false;
        }
        // here assigning the source distance is equal to the zero
        dist[src] = 0;

        for (int traverse = 0; traverse < V - 1; traverse++) {
            //  find the minimum distance vertex from the set of vertices not yet processed. u is always
            // equal to src in first iteration.
            int u = minDistance(dist,  shortestPathSet );
            //Mark that vertex as processed
            shortestPathSet [u] = true;

            for (int v = 0; v < V; v++) {
                //Update dist value of the adjacent vertices of the picked vertex
                // Update dist[v] only if is not in sptSet,there is an edge from u to v, and total weight of path from
                // src to v through u is smaller than current value of dist[v]
                if (! shortestPathSet [v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        // print the constructed distance array
        printSolution(dist);
    }
    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree


    private int minDistance(int[] dist, boolean[] sptSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }
    // Printing the Dijkstra paths of the provided vertices.
    private void printSolution(int[] dist) {
        System.out.println("Vertices \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t---->\t " + dist[i]);
        }
    }
}

public class Ayush_Kumar_683Assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();
        int [][] graph1= new int[V][V];
        Graph1 disj = new AdjacencyMatrixGraph1(V);

        System.out.println("Enter your adjacency matrix :");
        for (int i = 0; i <V; i++) {
            for(int j=0;j<V;j++){

                graph1[i][j]=sc.nextInt();


            }
        }

        System.out.println("Enter the source vertex:");
        int src = sc.nextInt();

        disj.dijkstra(graph1,src);
    }
}

// here i am using the concept of encapsulation as well as inheritance.
