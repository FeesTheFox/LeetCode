public class ifPalindrom {
    public boolean isPalindrome(int x) {
        boolean check = true;
        char[] chars = String.valueOf(x).toCharArray();

        if (x >= 0){
            for (int i = 0; i < chars.length/2; i++){
                if (chars[i] != chars[chars.length - 1 - i]){
                    check = false;
                    break;
                }
            }
        }else {
            check = false;
            return check;
        }
        return  check;
    }

    public static void main(String[] args) {
        ifPalindrom pal = new ifPalindrom();
        int x = -121;
        boolean result = pal.isPalindrome(x);
        System.out.println(result);
    }

}
