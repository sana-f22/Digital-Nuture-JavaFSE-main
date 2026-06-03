import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws Exception {

        File file = new File("output.txt");

        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}