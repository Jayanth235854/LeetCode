class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> arr=new ArrayList<>();
        String[] str=s.split(" ");
        for(String word: str){
            try{
                int num= Integer.parseInt(word);
                arr.add(num);
            }
            catch(NumberFormatException e){

            }
        }
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1))return false;
            System.out.print(arr.get(i)+" ");
        }
        return true;
    }
}