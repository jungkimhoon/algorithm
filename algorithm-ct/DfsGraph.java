import java.util.Iterator;
import java.util.LinkedList;

public class DfsGraph {
    private int V;
    private LinkedList<Integer> adj[];

    DfsGraph(int v) {
        V = v;
        adj = new LinkedList[v];

        for(int i=0; i<v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) { adj[v].add(w); }

    void dfs(int v) {
        boolean visited[] = new boolean[V];

        dfsUtil(v, visited);
    }

    void dfsUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> it = adj[v].listIterator();
        while(it.hasNext()) {
            int n = it.next();

            if(!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }
}
