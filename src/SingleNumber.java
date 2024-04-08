class SingleNumber {
    public int singleNumber(int[] nums) {
        int XOR=0;
        for (int num : nums) {
            XOR = XOR ^ num;
        }
        return XOR;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = new int[]{1,2,2};
        System.out.println(singleNumber.singleNumber(nums));
    }
}