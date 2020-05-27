import java.util.LinkedList;
import java.util.List;

public class cycleDetection {
    private int vertex;
    private LinkedList<Integer> adj[];

    public cycleDetection(int v){
        vertex = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i] = new LinkedList<Integer>();
    }

    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack){

        if(recStack[i])
            return true;

        if(visited[i])
            return false;

        visited[i] = true;
        recStack[i] = true;

        for(int n: adj[i]){
            if(isCyclicUtil(n,visited,recStack))
                return true;
        }
        recStack[i] = false;
        return false;


    }
    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    private boolean isCyclic(){

        boolean[] visited = new boolean[vertex];
        boolean[] recStack = new boolean[vertex];

        for (int i=0; i<vertex; i++){
            if(isCyclicUtil(i,visited,recStack))
                return true;
        }
        return false;

    }

    public static void main(String args[]){
        cycleDetection graph = new cycleDetection(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                    + "contain cycle");

    }


}

