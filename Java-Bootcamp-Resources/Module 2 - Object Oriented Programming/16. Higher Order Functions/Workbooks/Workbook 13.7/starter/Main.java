import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("Module 2 - Object Oriented Programming\\16. Higher Order Functions\\Workbooks\\Workbook 13.7\\starter\\emails.txt");
            Files.lines(path).filter(email -> !email.startsWith("Spam")).forEach(email -> System.out.println(email));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
