package hm03.alternative;

import java.util.Set;

public interface IPhoneBook {

    void add(String surname, String phoneNumber);

    Set<String> get(String surname);

    Set<String> getAllSurnames();
}