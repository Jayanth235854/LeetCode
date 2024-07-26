int findTheCity(int n, int** edges, int edgesSize, int* edgesColSize, int distanceThreshold) {
    int city[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i!=j)city[i][j]=INT_MAX;
            else city[i][j]=0;
        }
    }
    for(int i=0;i<edgesSize;i++){
        city[edges[i][0]][edges[i][1]]=edges[i][2];
        city[edges[i][1]][edges[i][0]]=edges[i][2];
    }
    for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(city[i][k]!=INT_MAX && city[k][j]!=INT_MAX){
                    if(city[i][j]>=city[i][k]+city[k][j]) city[i][j]=city[i][k]+city[k][j];
                }
            }
        }
    }
    int cityCount=n+1,ans=0;
    for(int i=0;i<n;i++){
        int c=0;
        for(int j=0;j<n;j++){
            if(i!=j && city[i][j]<=distanceThreshold)c++;
        }
        if(c<=cityCount){
            cityCount=c;
            ans=i;
        }
    }
    return ans;
}