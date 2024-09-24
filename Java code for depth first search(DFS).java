import java.util.*;

public class DepthFirstSearch {
    static class Graph {
        int vertexCount;
        LinkedList<Integer>[] adjacencyList;
        
        Graph(int vertexCount) {
            this.vertexCount = vertexCount;
            adjacencyList = new LinkedList[vertexCount];
            for (int i = 0; i < vertexCount; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }
        
        void addEdge(int source, int destination) {
            adjacencyList[source].add(destination);
        }
        
        void DFS(int vertex, boolean[] visited) {
            visited[vertex] = true;
            System.out.print(vertex + " ");
            
            Iterator<Integer> i = adjacencyList[vertex].listIterator();
            while (i.hasNext()) {
                int nextVertex = i.next();
                if (!visited[nextVertex]) {
                    DFS(nextVertex, visited);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Graph g = new Graph(4);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        System.out.println("Following is Depth First Traversal starting from vertex 2:");
        
        boolean[] visited = new boolean[4];
        g.DFS(2, visited);
    }
}


//Output: Following is Depth First Traversal starting from vertex 2:2 0 1 3 

/Here depth-first search (DFS) algorithm using an adjacency list representation of a graph.
The input to the algorithm is a vertex, and it visits all the vertices reachable from that vertex using DFS.
The visited array keeps track of which vertices have been visited.
