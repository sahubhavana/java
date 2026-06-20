import java.util.*;

class Main {

    static void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                dfs(nei, graph, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);

        boolean[] visited = new boolean[V];
        dfs(0, graph, visited);
    }
}
