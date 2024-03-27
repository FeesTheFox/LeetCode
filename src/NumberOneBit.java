public class NumberOneBit {
    public int hammingWeight(int n) {
        String bit = Integer.toBinaryString(n);
        char[] chars = bit.toCharArray();

        int res = 0;

        for (char aChar : chars) {
            if (aChar == '1') {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NumberOneBit numberOneBit = new NumberOneBit();
        int num = 11;
        int res = numberOneBit.hammingWeight(num);
        System.out.println(res);
    }
}
