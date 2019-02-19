package phonebook;

import java.util.List;

/**
 * @author Anna Bondarenko
 * @version 19.02.19
 */

public class PhoneBookHandler {

    /**
     * Generate PhoneBook
     */
    public void generatePhoneBook(List<PhoneBookRecord> phoneBook) {
        phoneBook.add(new PhoneBookRecord("Ivanov", "111111"));
        phoneBook.add(new PhoneBookRecord("Petrov", "222222"));
        phoneBook.add(new PhoneBookRecord("Lermontov", "333333"));
        phoneBook.add(new PhoneBookRecord("Antonov", "4444444"));
        phoneBook.add(new PhoneBookRecord("Ivanov", "5555555"));
        phoneBook.add(new PhoneBookRecord("Ivanova", "6666666"));
        phoneBook.add(new PhoneBookRecord("Lomonosov", "7777777"));
        phoneBook.add(new PhoneBookRecord("Bonch", "8888888"));
        phoneBook.add(new PhoneBookRecord("Pushkin", "999999"));

    }

    /**
     * Return
     * @param phoneBook
     * @param surname
     * @return
     */
    public String get(List<PhoneBookRecord> phoneBook, String surname) {
        String numbers = new String();
        for (PhoneBookRecord record: phoneBook) {
            if (record.getSurname().equalsIgnoreCase(surname)) {
                numbers = numbers  + record.getPhoneNum() + "; ";
            }
        }
        return numbers;
    }

}
