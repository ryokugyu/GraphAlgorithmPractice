/* Fowllowing code is inspired from this website:
 *https://www.geeksforgeeks.org/graph-and-its-representations/
 * We will now move from using LinkedList to using ArrayList as I am using Java.
 */
import java.util.*;

public class GraphRepresentationAdjacencyList {

    static void addEdge(ArrayList<ArrayList<Integer>> adjacentList, int u, int v){
        adjacentList.get(u).add(v);
        adjacentList.get(v).add(u); //Because this is an undirected graph
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adjacentList){
        for(int i=0;i<adjacentList.size();i++){
            System.out.println("Adjacency List of vertex "+ i);
            System.out.print("head");
            for(int j=0;j<adjacentList.get(i).size();j++){
                System.out.print(" -> " + adjacentList.get(i).get(j));
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int size=5;
        ArrayList<ArrayList<Integer>> adjacentList = new ArrayList<ArrayList<Integer>>(size);

        for(int i=0;i<size;i++){
            adjacentList.add(new ArrayList<Integer>());
        }

        addEdge(adjacentList, 0, 1);
        addEdge(adjacentList, 0, 4);
        addEdge(adjacentList, 1, 2);
        addEdge(adjacentList, 1, 3);
        addEdge(adjacentList, 1, 4);
        addEdge(adjacentList, 2, 3);
        addEdge(adjacentList, 3, 4);

        printGraph(adjacentList);
    }
}
