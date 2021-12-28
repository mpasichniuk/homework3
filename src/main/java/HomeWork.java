import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Драма", "Триллер", "Детектив", "Комедия", "Мелодрама", "Драма", "Романтика",
                "Триллер", "Боевик", "Романтика");

        Set<String> unique = new HashSet<String>(words);
        System.out.println(words.toString());
        System.out.println(unique.toString());
        for (String key : words) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
    }

