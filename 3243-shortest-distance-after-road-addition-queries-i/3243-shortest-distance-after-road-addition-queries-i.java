class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            graph.get(i).add(i + 1);
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            
            graph.get(u).add(v);

            result[i] = bfsShortestPath(graph, n);
        }

        return result;
    }
    private int bfsShortestPath(List<List<Integer>> graph, int n) {
        int[] distance = new int[n];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        distance[0] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            int currentDistance = distance[node];

            for (int neighbor : graph.get(node)) {
                if (distance[neighbor] == -1) { 
                    distance[neighbor] = currentDistance + 1;
                    queue.add(neighbor);
                }
            }
        }

        return distance[n - 1];
    }
}