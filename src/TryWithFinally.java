import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TryWithFinally {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("C:\\Users\\panchal.kumar\\IdeaProjects\\Day6-ExceptionHandling\\src\\text.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
