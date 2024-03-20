import java.util.*;

public class RemoveFromSortedArr {
    public int removeDuplicates(int[] nums){
        int index = 0;
        List<Integer> uniqueNumbers = new ArrayList<>();

        for(Integer num: nums){
            if (!uniqueNumbers.contains(num)){
                uniqueNumbers.add(num);
                nums[index] = num; // recording unique elements back to source array
                index++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(nums,index)));
        return index;
    }

    public static void main(String[] args) {
        RemoveFromSortedArr removeFromSortedArr = new RemoveFromSortedArr();
        int[] nums = {1,1,2};
        int res = removeFromSortedArr.removeDuplicates(nums);
        System.out.println(res);
    }
}
