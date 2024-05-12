int numJewelsInStones(char* jewels, char* stones) {
    int length0=strlen(jewels);
    int length1=strlen(stones);
    int count=0;
    for(int i=0;i<length0;i++){
        for(int j=0;j<length1;j++){
            if(jewels[i]==stones[j])count++;
        }
    }
    return count;
}