package phonebook;

/**
 * @author Anna Bondarenko
 * @version 19.02.19
 */


public class PhoneBookRecord {
    private String surname;
    private String phoneNum;

    public PhoneBookRecord(String surname, String phoneNum) {
        this.surname = surname;
        this.phoneNum = phoneNum;
    }

    public String getSurname() {
        return surname;
    }
    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public String toString() {
        return "{"
                 + surname  +
                ", phoneNumber='" + phoneNum + '\'' +
                '}';
    }
}
