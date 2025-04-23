class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=1;i<=n;i++){
            int val=i;
            if(i/10!=0) val=sum(i);
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        int max=0,count=0;
        for(Map.Entry<Integer,Integer> map:hm.entrySet()){
            if(map.getValue()>max)max=map.getValue();
        }
        for(Map.Entry<Integer,Integer> map:hm.entrySet()){
            if(map.getValue()==max)count++;
        }
        return count;
    }
    public int sum(int i){
        int val=i%10;
        i/=10;
        if(i>0)val+=sum(i);
        return val;
    }
}