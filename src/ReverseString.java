import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String reverse = "";
        for(int i=0;i<s.length();i++){
            reverse = s.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}
