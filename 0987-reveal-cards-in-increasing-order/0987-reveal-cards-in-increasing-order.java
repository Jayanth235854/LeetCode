class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int numberOfCards = deck.length;
        int[] result = new int[numberOfCards];
        Arrays.sort(deck);
        return revealCards(deck, result, 0, 0, false);
    }
    private int[] revealCards(int[] deck, int[] result, int deckIndex, int resultIndex, boolean skip) {
        int numberOfCards = deck.length;
        if (deckIndex == numberOfCards) {
            return result;
        }
        while (resultIndex < numberOfCards) {
            if (result[resultIndex] == 0) {
                if (!skip) {
                    result[resultIndex] = deck[deckIndex];
                    deckIndex++;
                }
                skip = !skip;
            }
            resultIndex++;
        }
        return revealCards(deck, result, deckIndex, 0, skip);
    }
}