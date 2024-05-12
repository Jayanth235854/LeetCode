int areaOfMaxDiagonal(int** dimensions, int dimensionsSize, int* dimensionsColSize) {
    double maxdiagonal=0;
    int max=0;
    for(int i=0;i<dimensionsSize;i++){
        double diagonal=sqrt(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
        if(diagonal>maxdiagonal||(diagonal==maxdiagonal && dimensions[i][0]*dimensions[i][1]>max)){
            maxdiagonal=diagonal;
            max=dimensions[i][0]*dimensions[i][1];
        }
    }
    return max;
}