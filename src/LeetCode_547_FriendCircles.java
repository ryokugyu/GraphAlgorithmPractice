//https://leetcode.com/problems/friend-circles/

public class LeetCode_547_FriendCircles {
    /*
class Solution {
    static int[] parent, rank;
    static int count ;

    //Initializing it's own parent
    static void makeSet(int n){
        for(int i =0;i<n;i++)
            parent[i] = i;
    }

    static public int find(int n){
        while(parent[n] != n){
            parent[n] = parent[parent[n]];
             n = parent[n];
        }
        return n;
    }
    //Union by rank
    static public void union(int x, int y){
        int xRep = find(x);
        int yRep = find(y);

        if(xRep == yRep)
            return;
        if(rank[xRep] > rank[yRep]){
            parent[yRep] = xRep;
        } else if(rank[yRep] > rank[xRep]){
            parent[xRep] = yRep;
        } else{
            parent[xRep] = yRep;
            rank[yRep]++;
        }
        count --;
    }

    public int findCircleNum(int[][] M) {
        int M_size = M.length;
        count = M_size;
        parent = new int[M_size];
        rank = new int[M_size];
        makeSet(M_size);
        for(int i=0; i<M_size;i++){
            for(int j=0;j<M_size;j++){
                if(M[i][j] == 1 && i!=j){
                    union(i,j);
                }
            }
        }
        return count;
    }
}
 */
}
