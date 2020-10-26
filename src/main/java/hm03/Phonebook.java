package hm03;

import java.util.*;

public class Phonebook {

    private HashMap<String, List<String>> phonebook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        if(!phonebook.containsKey(surname)) {
            phonebook.put(surname, Collections.singletonList(phoneNumber));
        } else {
            List<String> phoneNumbers = new ArrayList<>(phonebook.get(surname));
            phoneNumbers.add(phoneNumber);

            phonebook.put(surname, phoneNumbers);
        }
    }

    public List<String> get(String surname) {
        List<String> phoneNumbers = new ArrayList<>(phonebook.get(surname));
        return phoneNumbers;
    }

    public HashMap<String, List<String>> getPhonebook() {
        return phonebook;
    }
}
