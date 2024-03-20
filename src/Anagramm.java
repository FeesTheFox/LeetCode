import java.util.Arrays;

public class Anagramm {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }


    public static void main(String[] args) {
        Anagramm anagramm = new Anagramm();
        String s = "fac";
        String t = "car";
        boolean res = anagramm.isAnagram(s, t);
        System.out.println(res);
    }
}
