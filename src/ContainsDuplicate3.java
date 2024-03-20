public class ContainsDuplicate3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        boolean check = false;
        for (int i = 0; i <nums.length-1; i++){
            for (int j = i+1; j < nums.length;j++){
                if (i != j){
                    if (Math.abs(i-j) <= indexDiff){
                        if (Math.abs(nums[i] - nums[j]) <= valueDiff){
                            check = true;
                            return check;
                        }
                    }
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        ContainsDuplicate3 containsDuplicate = new ContainsDuplicate3();
        int[] nums = {1,5,9,1,5,9};
        int indexDiff = 2;
        int valueDiff = 3;
        boolean result = containsDuplicate.containsNearbyAlmostDuplicate(nums,indexDiff,valueDiff);
        System.out.println(result);
    }
}
