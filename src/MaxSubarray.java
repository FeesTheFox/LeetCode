public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maximum = nums[0];
        int current = nums[0];

        for (int i = 0; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            maximum = Math.max(maximum, current);
        }
        return maximum;
    }

    public static void main(String[] args) {
        MaxSubarray maxSubarray = new MaxSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubarray.maxSubArray(nums);
        System.out.println(result);
    }
}
