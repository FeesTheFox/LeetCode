import java.util.Arrays;

class ContainsDuplicate1 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean check = false;
        for (int i = 1; i<nums.length;i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        ContainsDuplicate1 containsDuplicate = new ContainsDuplicate1();
        int[] nums = {1,2,3,1};
        boolean result = containsDuplicate.containsDuplicate(nums);
        System.out.println(result);
    }
}