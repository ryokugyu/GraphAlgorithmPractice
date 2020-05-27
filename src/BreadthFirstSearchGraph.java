import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* Breadth First search implementation based on queue */
public class BreadthFirstSearchGraph {
    private int vertex;
    private LinkedList[] adj;

    BreadthFirstSearchGraph(int v){
        vertex=v;
        adj = new LinkedList[v];
        for(int i =0;i<v;i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void BFS(int s){
        boolean[] visited = new boolean[vertex];

        //Creating a queue
        Queue<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0){
            s = queue.poll();
            System.out.println(s+ " ");

            Iterator<Integer> i =  adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();

                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args){
        BreadthFirstSearchGraph graph =  new BreadthFirstSearchGraph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+  "(starting from vertex 2)");

        graph.BFS(2);
    }

}
