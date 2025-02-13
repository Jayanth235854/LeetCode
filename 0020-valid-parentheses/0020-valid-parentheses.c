bool isValid(char* arr) {
    char open[10000];
    int ind=0;
    for(int i=0;i<strlen(arr);i++){
        if(arr[i]=='[' || arr[i]=='{' || arr[i]=='('){
            open[ind++]=arr[i];
        }else if(ind!=0 && arr[i]==')' && open[ind-1]=='('){
            ind--;
        }else if(ind!=0 && arr[i]=='}' && open[ind-1]=='{'){
            ind--;
        }else if(ind!=0 && arr[i]==']' && open[ind-1]=='['){
            ind--;
        }else{
            return 0;
        }
    }
    return ind==0;
}