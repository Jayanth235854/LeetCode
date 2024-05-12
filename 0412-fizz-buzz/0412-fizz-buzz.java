class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            int k=i+1;
            if(k%15==0)arr[i]="FizzBuzz";
            else if(k%3==0)arr[i]="Fizz";
            else if(k%5==0)arr[i]="Buzz";
            else arr[i]=Integer.toString(k);
        }
        return Arrays.asList(arr);
    }
}