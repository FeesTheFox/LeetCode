import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2]; //the majority element will be found in the middle of an array

    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] size = {2,2,1,1,1,2,2};
        int res = majorityElement.majorityElement(size);
        System.out.println(res);
    }
}
