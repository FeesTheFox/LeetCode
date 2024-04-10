import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class CardReveal {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); // Sort the deck in increasing order

        int n = deck.length;
        int[] result = new int[n];
        Deque<Integer> indices = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            indices.add(i); // Initialize deque with indices 0, 1, 2, ..., n-1
        }

        for (int card : deck) {
            int idx = indices.poll(); // Get the next available index
            result[idx] = card; // Place the card in the result array
            if (!indices.isEmpty()) {
                indices.add(indices.poll()); // Move the used index to the end of deque
            }
        }

        return result;
    }

    public static void main(String[] args) {
        CardReveal reveal = new CardReveal(); //creating an instance of CardReveal
        int[] deck = {1,2,3,17,18,19};
        System.out.println(Arrays.toString(reveal.deckRevealedIncreasing(deck)));
    }
}
