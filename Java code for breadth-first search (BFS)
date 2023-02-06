import java.util.*;

public class BreadthFirstSearch {
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
        
        void BFS(int startVertex) {
            boolean[] visited = new boolean[vertexCount];
            
            LinkedList<Integer> queue = new LinkedList<>();
            visited[startVertex] = true;
            queue.add(startVertex);
            
            while (queue.size() != 0) {
                startVertex = queue.poll();
                System.out.print(startVertex + " ");
                
                Iterator<Integer> i = adjacencyList[startVertex].listIterator();
                while (i.hasNext()) {
                    int nextVertex = i.next();
                    if (!visited[nextVertex]) {
                        visited[nextVertex] = true;
                        queue.add(nextVertex);
                    }
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
        
        System.out.println("Following is Breadth First Traversal starting from vertex 2:");
        g.BFS(2);
    }
}


// Output: Following is Breadth First Traversal starting from vertex 2: 2 0 3 1

// Here a simple breadth-first search (BFS) algorithm using an adjacency list representation of a graph.
The input to the algorithm is a start vertex, and it visits all the vertices reachable from that vertex using BFS.
The visited array keeps track of which vertices have been visited, and the queue stores the vertices to be visited.
