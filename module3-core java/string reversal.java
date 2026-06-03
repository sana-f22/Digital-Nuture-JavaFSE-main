import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());
    }
}