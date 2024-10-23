import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(55.99, 33.99, 88.99, 11.49, 55.99, 111.99, 77.99);
prices.sort((left,right)->left.compareTo(right));
        // TODO

        System.out.println("\nPrices\n------");
        prices.forEach(p ->System.out.println(p) );

        // TODO

        List<String> books = Arrays.asList(
            "To Kill a Mockingbird",
            "The Great Gatsby",
            "Pride and Prejudice",
            "The Catcher in the Rye",
            "The Alchemist",
            "One Hundred Years of Solitude",
            "Moby-Dick",
            "The Brothers Karamazov",
            "The Lord of the Rings",
            "The Picture of Dorian Gray"
        );

        // TODO
        books.sort((left,right)->right.compareTo(left));

        System.out.println("\nLibrary\n--------");

        // TODO
        books.forEach(book -> System.out.println(book));

    }
}