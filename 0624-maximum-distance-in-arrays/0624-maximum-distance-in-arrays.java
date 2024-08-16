class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> current = arrays.get(i);
            int currentMin = current.get(0);
            int currentMax = current.get(current.size() - 1);
            
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - globalMin));
            maxDistance = Math.max(maxDistance, Math.abs(globalMax - currentMin));
            
            globalMin = Math.min(globalMin, currentMin);
            globalMax = Math.max(globalMax, currentMax);
        }
        
        return maxDistance;
    }
}