/* import java.util.Scanner;
public class GraphRepresentationAdjacenyMatrix {
    private int vertices;
    private int[][] adjacencyMatrix;

    public void RepresentGraphAdjacencyMatrix(int v){
        vertices = v;
        adjacencyMatrix = new int[vertices+1][vertices+1];
    }

    public void makeEdge(int to, int from, int edge){
        try{
            adjacencyMatrix[to][from] = edge;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public int getEdge(int to, int from){
        try{
            return adjacencyMatrix[to][from];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        return -1;
    }


    public static void main(String args[]){
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter the number of vertices: ");
            v = sc.nextInt();
            System.out.println("Enter the number of edges: ");
            e = sc.nextInt();

            GraphRepresentationAdjacenyMatrix graph = new GraphRepresentationAdjacenyMatrix(v);

            System.out.println("Enter the edges: <to> <from>");
            while (count <= e)
            {
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }

            System.out.println("The adjacency matrix for the given graph is: ");
            System.out.print("  ");
            for (int i = 1; i <= v; i++)
                System.out.print(i + " ");
            System.out.println();

            for (int i = 1; i <= v; i++)
            {
                System.out.print(i + " ");
                for (int j = 1; j <= v; j++)
                    System.out.print(graph.getEdge(i, j) + " ");
                System.out.println();
            }

        }
        catch (Exception E)
        {
            System.out.println("Something went wrong");
        }

        sc.close();

    }
}
*/