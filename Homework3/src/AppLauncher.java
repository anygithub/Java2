/**
 * @author Anna Bondarenko
 * @version 19.02.19
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AppLauncher {

    public static void main(String[] args) {
        System.out.println("Exercise1");
        runExercise1();
        System.out.println();

        System.out.println("Exercise2");
        runExercise2();
    }

    //Exercise1
    public static void runExercise1() {
        List<String> arrayList = new ArrayList<>();
        ListHandler listHandler = new ListHandler();
        Set<String> hashSet;

        //generate list of strings
        listHandler.generateList(arrayList);
        System.out.println(arrayList);

        //get the list of unique words
        hashSet = listHandler.getListOfUniqueWords(arrayList);
        System.out.println(hashSet);

        // get count for each unique word
        listHandler.printCountOfUniqueWords(arrayList,hashSet);
    }

    //Exercise2
    public static void runExercise2() {
        List<PhoneBookRecord> phoneBook = new ArrayList<>();
        PhoneBookHandler phoneBookHandler = new PhoneBookHandler();
        String numbers = new String();

        // generate PhoneBook
        phoneBookHandler.generatePhoneBook(phoneBook);

        // add new contact in PhoneBook
        phoneBook.add(new PhoneBookRecord("Lermontov","10101010"));
        System.out.println(phoneBook);

        // get phone numbers by surname
        numbers = phoneBookHandler.get(phoneBook,"Lermontov");
        System.out.println(numbers);

    }
}
