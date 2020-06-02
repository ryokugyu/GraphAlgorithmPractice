/*
We will use union find algorithm alongside Disjoint sets for finding cycles in undirected graph.
Assumptions - No self loops present.
 */

public class CycleDetectionUnionFind {
    int vertex, edges;
    Edge[] edge;
    static int[] parent;

    static class Edge{
        int src, dest;

    }

    CycleDetectionUnionFind(int v, int e){
        vertex=v;
        edges=e;
        edge = new Edge[edges];
        for(int i =0;i<edges;i++) {
            edge[i] = new Edge();
        }
        makeParent();
    }

    void makeParent(){
        parent = new int[vertex];
        for(int i=0;i<vertex;i++)
            parent[i] = -1;
    }

    //Finding the representative
    int find(int i){
        if(parent[i] == -1)
            return i;
        return find(parent[i]);
    }

    //Simple union code
    void union(int x, int y){
        int xset = find(x);
        int yset = find(y);
        parent[xset] = yset;
    }

    int isCycle(CycleDetectionUnionFind graph){
        for(int i=0;i<edges;i++){
            int x = find(graph.edge[i].src);
            int y = find(graph.edge[i].dest);

            if(x == y)
                return 1;

            graph.union(x, y); // This step is important, as it will combine two trees.
        }
        return 0;
    }

    //driver code
    public static void main (String[] args){
        int V=3; //number of vertex
        int E=3; // number of edges

        CycleDetectionUnionFind graph;
        graph = new CycleDetectionUnionFind(V, E);

        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;

        // add edge 1-2
        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;

        // add edge 0-2
        graph.edge[2].src = 0;
        graph.edge[2].dest = 2;

        if(graph.isCycle(graph) == 1){
            System.out.println("Graph contains cycle.");
        }
        else
            System.out.println("Graph does not contain cycle.");
    }


}

