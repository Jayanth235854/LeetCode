class TopologicalSortOutput {
    boolean isPossible ;
    int [] order ;
}
class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int[][] matrix = new int[k][k];
        TopologicalSortOutput output = sortTopological(k, rowConditions);
        if (!output.isPossible){
            return new int[0][0];
        }
        
        int[] rowOrder = output.order;
        int[] rowLocation = new int[k];
        int currInd= 0 ;
        
        for (int num : rowOrder){
            matrix[currInd][0] = num ;
            rowLocation[num-1] = currInd ;
            currInd++ ;
        }
        
        output = sortTopological(k, colConditions);
        if (!output.isPossible){
            return new int[0][0];
        }
        
        int[] colOrder = output.order ;
        for (int i=0; i < k ; i++){
            int currElementRowLocation = rowLocation[colOrder[i]-1] ;
            matrix[currElementRowLocation][0] = 0 ;
            matrix[currElementRowLocation][i] = colOrder[i];
        }
        return matrix ;
    }
    private TopologicalSortOutput sortTopological(int k , int [][] dependencies){
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int [] indegreeCount = new int[k+1] ;
        
        for (int [] edge :dependencies){
            graph.putIfAbsent(edge[0], new HashSet<>());
            graph.get(edge[0]).add(edge[1]);
        }
        for (Map.Entry<Integer, Set<Integer>> entry: graph.entrySet()){
            for (int node: entry.getValue()){
                indegreeCount[node]++ ;
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        for (int i=1 ; i <=k; i++){
            if (indegreeCount[i] == 0) {
                queue.add(i);
                visited.add(i);
            }
        }
        int [] order = new int[k];
        int i= 0 ;
        while(!queue.isEmpty()){
            int node = queue.poll();
            order[i++] = node;
            Set<Integer> adjNodes = graph.get(node);
            if (adjNodes == null){
                continue ;
            }
            for(int adjNode : adjNodes) {
                if (!visited.contains(adjNode)) {
                    indegreeCount[adjNode]-- ;
                    if (indegreeCount[adjNode] == 0){    
                        queue.add(adjNode);
                        visited.add(adjNode);
                    }   
                }
            }   
        }
        TopologicalSortOutput output = new TopologicalSortOutput();
        output.order = order ;
        output.isPossible = visited.size() == k ;
        return output ;
    }
}