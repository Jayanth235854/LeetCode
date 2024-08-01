void merger(int *freq,int start,int mid,int end){
    int ls=mid-start+1, rs=end-mid;
    int la[ls], ra[rs];
    for(int i=0;i<ls;i++)la[i]=freq[start+i];
    for(int i=0;i<rs;i++)ra[i]=freq[mid+1+i];
    int i=0,j=0,c=start;
    while(i<ls && j<rs){
        if(la[i]<ra[j])freq[c++]=la[i++];
        else freq[c++]=ra[j++];
    }
    while(i<ls)freq[c++]=la[i++];
    while(j<rs)freq[c++]=ra[j++];
}

void mergeSort(int *freq,int start, int end){
    if(start<end){
        int mid=(start+end)/2;
        mergeSort(freq,start,mid);
        mergeSort(freq,mid+1,end);
        merger(freq,start,mid,end);
    }
}

int minimumPushes(char* word) {
    int n=strlen(word);
    int freq[26]={0};
    for(int i=0;i<n;i++)freq[word[i]-'a']++;

    mergeSort(freq,0,25);
    int l=25,count=0,pro=1,ans=0;
    while(freq[l]!=0){
        count++;
        if(count>8){
            count=1;
            pro++;
        }
        ans=ans+pro*freq[l];
        l--;
        if(l==-1)break;
    }
    return ans;
}