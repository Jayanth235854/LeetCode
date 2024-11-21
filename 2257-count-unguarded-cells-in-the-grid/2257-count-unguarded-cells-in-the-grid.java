class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int count=0;
        char[][] arr=new char[m][n];
        for(int i=0;i<m;i++) Arrays.fill(arr[i],'0');
        for(int[] guard:guards) arr[guard[0]][guard[1]]='G';
        for(int[] wall:walls) arr[wall[0]][wall[1]]='W';
        for(int[] a:guards){
            //up
            int i=a[0]-1,j=a[1];
            while(i>=0 && j>=0 && arr[i][j]!='W' && arr[i][j]!='G'){
                arr[i][j]='g';
                i--;
            }
            //down
            i=a[0]+1; j=a[1];
            while(i<m && j<n && arr[i][j]!='W' && arr[i][j]!='G'){
                arr[i][j]='g';
                i++;
            }
            //left
            i=a[0]; j=a[1]-1;
            while(i>=0 && j>=0 && arr[i][j]!='W' && arr[i][j]!='G'){
                arr[i][j]='g';
                j--;;
            }
            //right
            i=a[0]; j=a[1]+1;
            while(i<m && j<n && arr[i][j]!='W' && arr[i][j]!='G'){
                arr[i][j]='g';
                j++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]=='0')count++;
            }
        }
        return count;
    }
} 