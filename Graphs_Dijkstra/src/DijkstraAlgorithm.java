import java.util.Scanner;

abstract class Graph {
    protected int V;
    protected int[][] graph;

    public Graph(int V) {
        this.V = V;
        graph = new int[V][V];
    }

    abstract public void addEdge(int src, int dest, int weight);
    abstract public void dijkstra(int[][] graph1, int src);
}

class AdjacencyMatrixGraph extends Graph {
    public AdjacencyMatrixGraph(int V) {
        super(V);
    }

    public void addEdge(int src, int dest, int weight) {
        graph[src][dest] = weight;
        graph[dest][src] = weight;
    }

    public void dijkstra(int[][] graph1, int src) {
        int[] dist = new int[V];
        boolean[] sptSet = new boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist);
    }

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

    private void printSolution(int[] dist) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }
}

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();

        Graph k = new AdjacencyMatrixGraph(V);

        System.out.println("Enter the number of edges:");
        int E = sc.nextInt();

        for (int i = 0; i < E; i++) {
            System.out.println("Enter edge " + (i + 1) + " source, destination and weight:");
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();
            k.addEdge(src, dest, weight);
        }

        System.out.println("Enter the source vertex:");
        int src = sc.nextInt();

        k.dijkstra(k.graph, src);// k.graph access the protected 2d array in Graph class.
    }}

