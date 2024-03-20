import java.util.HashMap;
import java.util.Map;

public class RomanToNumeric {
    public int romanToInt(String s){
        Map<Character, Integer> num = new HashMap<>();

        num.put('I', 1);
        num.put('V', 5);
        num.put('X', 10);
        num.put('L', 50);
        num.put('C', 100);
        num.put('D', 500);
        num.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++){
            if (i < s.length()-1 && num.get(s.charAt(i)) < num.get(s.charAt(i+1))){
                res -= num.get(s.charAt(i));
            }else {
                res += num.get(s.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RomanToNumeric romanToNumeric = new RomanToNumeric();
        String s = "III";
        int result = romanToNumeric.romanToInt(s);
        System.out.println(result);
    }
}
