public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean check = false;
        for (int i = 0; i <nums.length; i++){
            for (int j = 0; j < nums.length;j++){
                if (i != j && nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        boolean result = containsDuplicate.containsDuplicate(nums);
        System.out.println(result);
    }
}
