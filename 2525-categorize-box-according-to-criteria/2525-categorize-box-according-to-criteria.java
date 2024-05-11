class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        String hy="",by="",ans="";
        long vol=(long)length*width*height;
        if(length>=10000 || width>=10000 || height>=10000 || vol>=1000000000)by="Bulky";
        if(mass>=100)hy="Heavy";
        if(hy=="Heavy" && by=="Bulky")ans="Both";
        else if(hy!="Heavy" && by!="Bulky")ans="Neither";
        else if(by=="Bulky" && hy!="Heavy")ans="Bulky";
        else ans="Heavy";
        return ans;
    }
}