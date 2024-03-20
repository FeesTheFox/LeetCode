import java.util.List;

public class PairwiseSorted {
    public static boolean isPairwiseSorted(List<Integer> list) {
        if (list.size() % 2 != 0) {
            list = list.subList(0, list.size() - 1); // Deleting the last element, if the amount of elements is odd
        }

        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i) > list.get(i + 1)) { //Checking if sorted
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42);
        boolean result = isPairwiseSorted(list);
        System.out.println(result); // the output is true
    }
}