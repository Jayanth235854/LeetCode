bool checkIfExist(int* arr, int arrSize) {
    for(int i=0;i<arrSize;i++){
        for(int j=i+1;j<arrSize;j++){
            if(arr[i]==2*arr[j] || arr[i]*2==arr[j])return true;
        }
    }
    return false;
}