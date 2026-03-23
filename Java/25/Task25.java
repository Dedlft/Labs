import java.util.regex.Pattern;

public class Task25 {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        String s1 = "abcdefghijklmnopqrstuv18340";
        String s2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String s3 = " abcdefghijklmnopqrstuv18340";
        String s4 = "abcdefghijklmnopqrstuv18340\n";

        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));
        System.out.println(s3.matches(regex));
        System.out.println(s4.matches(regex));
}
}
