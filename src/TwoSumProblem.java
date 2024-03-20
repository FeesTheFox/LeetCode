import java.util.HashMap;



//summing of the array
public class TwoSumProblem {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> n = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int targetcheck = target -nums[i];
            if (n.containsKey(targetcheck)){
                return new int[] {n.get(targetcheck), i};
            }
            n.put(nums[i], i);
        }
        throw new IllegalArgumentException("Nuh-uh");
    }

    public static void main(String[] args) {
        TwoSumProblem solution = new TwoSumProblem();
        int[] nums = {3,1,4,3};
        int target = 6;
        int[] result = solution.twoSum(nums,target);
        System.out.println(result[0] + " " + result[1]);
    }
}