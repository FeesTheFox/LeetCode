public class NumericToWords {
    String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        return numTransfer(num).trim();
    }

    private String numTransfer(int num) {
        if (num >= 1000000000) return (numTransfer(num / 1000000000) + " Billion " + numTransfer(num % 1000000000));
        if (num >= 1000000) return (numTransfer(num / 1000000) + " Million " + numTransfer(num % 1000000));
        if (num >= 1000) return (numTransfer(num / 1000) + " Thousand " + numTransfer(num % 1000));
        if (num >= 100) return (numTransfer(num / 100) + " Hundred " + numTransfer((num % 100))).trim();
        if (num >= 20) return (tens[num / 10] + " " + numTransfer(num % 10)).trim();
        return ones[num];
    }

    public static void main(String[] args) {
        NumericToWords toWords = new NumericToWords();
        int num = 100000;
        String res = toWords.numberToWords(num);
        System.out.println(res);
    }
}
