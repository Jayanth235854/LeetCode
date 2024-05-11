class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
     int[] arr = new int[2];
     for(int i:students){
        arr[i]++;
     }   
     for(int i:sandwiches){
        if(arr[i]==0)
        break;
        arr[i]--;
     }
     return arr[0]+arr[1];
    }
}