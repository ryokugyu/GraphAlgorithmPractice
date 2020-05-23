import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearchGraph {

    private int Vertex;
    private LinkedList<Integer>[] adj;

    DepthFirstSearchGraph(int v){
        Vertex = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;++i)
            adj[i] = new LinkedList<Integer>();
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void DFSUtils(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v +" ");

        for (int n : adj[v]) {
            if (!visited[n])
                DFSUtils(n, visited);
        }
    }

    public void DFS(int v){

        boolean visited[] = new boolean[Vertex];
        DFSUtils(v,visited);
    }

    public static void main(String args[]){
        DepthFirstSearchGraph g = new DepthFirstSearchGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal starting from vertex 1");
        g.DFS(1);
    }
}
