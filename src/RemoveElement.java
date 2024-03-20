public class RemoveElement {
    public Object[] removeElement(int[] nums, int val) {
        int k = 0;
        int[] numbers = nums;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == val) {
                numbers[i] = -1;
            } else {
                k++;
            }
        }
        Object[] result = new Object[2];
        result[0] = k;
        result[1] = numbers;

        return result;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Object[] result = removeElement.removeElement(nums, val);
        int k = (int) result[0];
        int[] numbers = (int[]) result[1];

        System.out.println("k: " + k);
        System.out.print("numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
