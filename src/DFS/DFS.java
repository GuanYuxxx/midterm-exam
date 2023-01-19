/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph {
    private int V; // No. of vertices

    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v,boolean visited[],Stack stack) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited,stack);
        }

        // Push vertex to stack which stores topological sort
        stack.push(new Integer(v));
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Create a stack for topological sorting
        Stack stack = new Stack();

        // Call the recursive helper function to store Topological
        // Sort starting from all vertices one by one
        for (int i=0; i<V; i++)
            if (visited[i] == false)
                DFSUtil(i, visited, stack);

        // Print contents of the stack
        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }

    // Driver code
    public static void main(String args[]) {
        // Create a graph given in the above diagram
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological Sort");
        g.DFS(5);
    }
}
