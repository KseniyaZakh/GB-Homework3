package gb.ru.homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private HashMap<String, Set<String>> phones;


    public PhoneBook() {
        this.phones = new HashMap<>();
    }

    public void add(String lastName, String phone) {
        Set<String> phoneSet = phones.getOrDefault(lastName, new HashSet<>());
        phoneSet.add(phone);
        phones.put(lastName,phoneSet);
    }
public Set<String> getName(String lastName){
        return phones.getOrDefault(lastName, new HashSet<>());

}

}
