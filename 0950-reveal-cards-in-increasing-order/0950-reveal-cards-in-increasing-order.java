class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        int[] arr=new int[n];
        Arrays.sort(deck);
        LinkedList<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++)queue.offer(i);
        for(int i=0;i<n;i++){
            arr[queue.poll()]= deck[i];
            queue.offer(queue.poll());
        }
        return arr;
    }
}