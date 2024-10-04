class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long res=0;
        int sum=skill[0] + skill[skill.length-1], i=0,j=skill.length-1;
        while(i<j){
            if(sum!=skill[i]+skill[j])return -1;
            res+=skill[i]*skill[j];
            i++; j--;
        }
        return res;
    }
}