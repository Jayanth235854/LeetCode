class Solution {
    private String[] belowTen=new String[]
    {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    private String[] belowTwenty=new String[]
    {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] belowHundred=new String[]
    {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private int Hundred=100;
    private int Thousand=1000;
    private int Million=1000000;
    private int Billion=1000000000;
    public String numberToWords(int num) {
        return num==0?"Zero":help(num);
    }
    public String help(int num){
        StringBuilder a=new StringBuilder();
        if(num<10){
            a.append(belowTen[num]);
        }else if(num<20){
            a.append(belowTwenty[num-10]);
        }else if(num<100){
            a.append(belowHundred[num/10]);
            if(num%10!=0)a.append(" ");
            a.append(help(num%10));
        }else if(num<1000){
            a.append(belowTen[num/100]);
            a.append(" Hundred");
            if(num%100!=0)a.append(" ");
            a.append(help(num%100));
        }else if(num<Million){
            a.append(help(num/1000));
            a.append(" Thousand");
            if(num%1000!=0)a.append(" ");
            a.append(help(num%1000));
        }else if(num<Billion){
            a.append(help(num/Million));
            a.append(" Million");
            if(num%Million!=0)a.append(" ");
            a.append(help(num%Million));
        }else{
            a.append(help(num/Billion));
            a.append(" Billion");
            if(num%Billion!=0)a.append(" ");
            a.append(help(num%Billion));
        }
        return a.toString();
    }
}