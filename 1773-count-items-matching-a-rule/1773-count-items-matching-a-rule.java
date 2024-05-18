class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i=0;
        if(ruleKey.equals("color"))i=1;
        if(ruleKey.equals("name"))i=2;
        int count=0;
        for(int a=0;a<items.size();a++){
            if(items.get(a).get(i).equals(ruleValue))count++;
        }
        return count;
    }
}