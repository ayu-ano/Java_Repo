// here we are using encapsulation in java
import java.util.Scanner;
public class graph{
    // initialising the variable of the class
    private int size;
    private int[][]adjacency_matrix= new int[20][20];
    // creating a graph constructor taking size as parameter
    public graph(int size){
        this.size=size;
        // first initialising our adjacency matrix with zeroes.
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                adjacency_matrix[i][j]=0;
            }
        }

    }
    // function for printing the adjacency matrix
    public void print_matrix(){
        System.out.println("ADJACENCY MATRIX :");
        for(int i=0;i<size;i++){
            System.out.println();
            for(int j=0;j<size;j++){
                System.out.print(adjacency_matrix[i][j]+" ");
            }
        }
        System.out.println();
    }


        // function for add the edges
        public void addEdges ( int source, int destination){
        // checking the condition
        // whether our source is less than zero or  greater than the size then the vertices will not be inserted.
        if (source < 0 || source >= size) {
            System.out.println("vertice source is not be inserted" + source);
        }
        // whether our destination is less than zero or  greater than the size then the vertices will not be inserted.
        if (destination < 0 || destination >= size) {
            System.out.println("vertice destination is not be inserted" + destination);
        }
        // checking whether  there is self loop
        if (source == destination) {
            System.out.println("it is the same vertices");

        } else {
            // assign the matrix =1 if there is path between the source and destination
            adjacency_matrix[source][destination] = 1;
            adjacency_matrix[destination][source] = 1;
        }
    }
        // function for remove the edges
        public void removeEdges ( int source, int destination){
        // whether our source is less than zero or  greater than the size then the vertices will not be inserted.
        if (source < 0 || source >= size) {
            System.out.println("vertice source is not be inserted" + source);
        }
        // whether our destination is less than zero or  greater than the size then the vertices will not be inserted.
        if (destination < 0 || destination >= size) {
            System.out.println("vertice destination is not be inserted" + destination);
        }
        // checking whether  there is self loop
        if (source == destination) {
            System.out.println("it is the same vertices");

        } else {
            // assign the matrix =0 if there is no path between the source and destination
            adjacency_matrix[source][destination] = 0;
            adjacency_matrix[destination][source] = 0;
        }
    }


        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of vertices you want :");
        // Scanner sc=new Scanner(System.in);
        int vertices = sc.nextInt();
        System.out.println();
        graph matrix = new graph(vertices);
        while (true) {
            System.out.println("******************************************************************");
            System.out.println("1. Add the edges in the graph: ");
            System.out.println("2. Remove the edges in the graph: ");
            System.out.println("3. Print the matrix of the graph: ");
            System.out.println("4. Exit from the program : ");
            System.out.println("******************************************************************");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            System.out.println();
            if (ch == 1) {
                System.out.print("Enter the source vertex: ");
                int source = sc.nextInt();
                System.out.print("Enter the destination vertex: ");
                int destination = sc.nextInt();
                matrix.addEdges(source, destination);

            } else if (ch == 2) {
                System.out.print("Enter the source vertex: ");
                int source = sc.nextInt();
                System.out.print("Enter the destination vertex: ");
                int destination = sc.nextInt();
                matrix.removeEdges(source, destination);
            } else if (ch == 3) {
                matrix.print_matrix();
            } else if (ch == 4) {

                break;
            } else {
                System.out.println("you are not enter the valid option :");
            }
        }


    }
    }
