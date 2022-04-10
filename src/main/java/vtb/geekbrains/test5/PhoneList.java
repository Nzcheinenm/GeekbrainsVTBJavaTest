package vtb.geekbrains.test5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneList {
    private Map<String,String> map = new HashMap<>();

    public PhoneList (String phone, String lastName) {
        map.put(phone,lastName);
    }

    public void add(String phone,String lastName) {
        this.map.put(phone,lastName);
    }

    public List get(String lastName) {
        map.forEach((i,s) -> {
            if(s.equals(lastName)) {
                System.out.println("Фамилия - " + s + ", номер телефона - " + i);
            }
        });
        return null;
    }
}
