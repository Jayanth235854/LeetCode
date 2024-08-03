int countCharacters(char** words, int wordsSize, char* chars) {
    int frq[26]={0};
    int ans=0;
    for(int i=0;i<strlen(chars);i++)frq[chars[i]-'a']++;
    for(int i=0;i<wordsSize;i++){
        int freq[26]={0};
        for(int j=0;j<strlen(words[i]);j++)freq[words[i][j]-'a']++;
        int c=0;
        for(int j=0;j<strlen(words[i]);j++){
            if(freq[words[i][j]-'a']>frq[words[i][j]-'a']){
                c++;
                break;
            }
        }
        if(c==0){
            ans=ans+strlen(words[i]);
        }
    }
    return ans;
}