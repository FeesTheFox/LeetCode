public class ReversedBit {

    public static int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            reversed |= (bit << (31 - i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        int n = 43261596; // 00000010100101000001111010011100
        System.out.println(reverseBits(n)); // 964176192 (0011100101111000
    }
}
