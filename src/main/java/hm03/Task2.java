package hm03;

import java.util.HashMap;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Vlad", "79105554444");
        phonebook.add("Vlad", "79873332222");
        phonebook.add("Aleksey", "749510055555");


        HashMap<String, List<String>> catalog = phonebook.getPhonebook();

        for (String key : catalog.keySet()) {
            List<String> value = catalog.get(key);
            System.out.println(key + " - " + value);
        }
    }

}
