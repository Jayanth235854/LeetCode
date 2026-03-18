class Solution {
    public int numUniqueEmails(String[] emails) {
        int n=emails.length;
        Set<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder(emails[i]);
            for(int x=0;x<sb.length();x++){
                if(sb.charAt(x)=='.'){sb.deleteCharAt(x); x--;}
                else if(sb.charAt(x)=='+'){
                    int size=x;
                    while(sb.charAt(x)!='@')x++;
                    sb.delete(size,x);
                    System.out.println(sb);
                    break;
                }else if(sb.charAt(x)=='@') break;
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}