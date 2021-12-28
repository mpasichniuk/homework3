import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, String> book;
        public Phonebook(String surname, String number){
            this.book = new HashMap<>();

        book.put("Иванов", "2333-333-33");
        book.put("Sidorov", "562-123-123");
        book.put("Mironov", "------");

            if(book.containsKey(surname)){
                String numbers = book.get(surname);
                if(!numbers.contains(number)){
                    book.replace(surname, number);
                    System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
                } else {
                    System.out.println(String.format("Номер %s уже существует для фамилии %s", number, surname));
                }
            } else {
                book.put(surname, String.valueOf(new ArrayList<String>(Arrays.asList(number))));
                System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
            }
        }
        public String get(String surname){
            if(book.containsKey(surname)){
                return surname;
            } else {
                System.out.println(String.format("В справочнике нет записи для фамилии %s", surname));
                return new String();

            }


    }
}
