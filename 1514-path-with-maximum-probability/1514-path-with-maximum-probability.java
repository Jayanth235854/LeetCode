class Solution {
    public double maxProbability = 0;
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Integer>> graph = new ArrayList<>();
        Map<String, Double> probMatrix = new HashMap<>();
        
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        int count = 0;
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
            probMatrix.put(edge[0]+"_"+edge[1], succProb[count]);
            probMatrix.put(edge[1]+"_"+edge[0], succProb[count]);
            count++;
        }
        double[] prob = new double[n];
        prob[start_node] = 1;
        boolean[] visited = new boolean[n];
        
        while(!allNodesVisited(visited)){
            int choosenOne = chooseNextNode(visited, prob);
            visited[choosenOne] = true;
            for(int nei: graph.get(choosenOne)){
                prob[nei] = Math.max(prob[nei], prob[choosenOne]*probMatrix.get(choosenOne+"_"+nei));
            }
        }
        return prob[end_node];
    }
    public boolean allNodesVisited(boolean[] visited){
        for(boolean v: visited){
            if(!v) return false;
        }
        return true;
    }
    
    public int chooseNextNode(boolean[] visited, double[] prob){
        int maxIndex = -1;
        
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                maxIndex = i;
                break;
            }
        }
        
        for(int i=maxIndex+1;i<visited.length;i++){
            if(!visited[i] && prob[i] > prob[maxIndex]){
                maxIndex = i;
            }
        }
        
        return maxIndex;
    }
}