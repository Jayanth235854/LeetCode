class Solution {
    public int timeConvert(String time){
        String a[]=time.split(":");
        String t=a[0]+a[1];
        return Integer.valueOf(t);
    }
    public boolean haveConflict(String[] event1, String[] event2) {
        int a1=timeConvert(event1[0]);
        int a2=timeConvert(event1[1]);
        int b1=timeConvert(event2[0]);
        int b2=timeConvert(event2[1]);
        if(b1>=a1 && b1<=a1 || b2>=a1 && b2<=a1 || a1>=b1 && a1<=b2 || a2>=b1 && a2<=b2)return true;
        return false;
    }
}