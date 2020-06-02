//Question Link - https://leetcode.com/problems/redundant-connection/
public class LeetCode_684_RedundantConnection {
    /*
    class Solution {
    static int[] cycle_edge = new int[2];
    static int[] parent, rank;

    static void makeSet(int n) {
        for (int i = 0; i < n; i++)
            parent[i] = i;
    }

    static public int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    static public void union(int x, int y) {
        int xRep = find(x);
        int yRep = find(y);

        if (xRep == yRep){
            cycle_edge[0] = x;
            cycle_edge[1] = y;
            return;
        }else if (rank[xRep] > rank[yRep]) {
            parent[yRep] = xRep;
        } else if (rank[yRep] > rank[xRep]) {
            parent[xRep] = yRep;
        } else {
            parent[xRep] = yRep;
            rank[yRep]++;
        }
    }

    static public int[] findRedundantConnection(int[][] edges) {
        int size =1001;
        parent = new int[size];
        rank = new int[size];
        makeSet(size);
        for (int i = 0; i < edges.length; i++) {
            if(edges[i][0]<edges[i][1]){
                union(edges[i][0], edges[i][1]);
            }
            }
        return cycle_edge;
    }
}

     */
}
