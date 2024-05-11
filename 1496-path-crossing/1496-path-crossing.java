class Solution {
    public boolean isPathCrossing(String path) {
     var x = 0;
     var y = 0;
     var seen = new HashSet<Integer>();  
     seen.add(0); 
     for (int i = 0, n = path.length(); i < n; i++) {
        switch(path.charAt(i)) {
            case 'N' -> y++;
            case 'S' -> y--;
            case 'E' -> x++;
            case 'W' -> x--;
        }
        var position = x * 1000 + y;
        if (!seen.add(position)) {
            return true;
        }
     }
     return false;
    }
}