package hm03;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>(20);

        cities.add("Москва");
        cities.add("Санкт-Петербург");
        cities.add("Новосибирск");
        cities.add("Новосибирск");
        cities.add("Екатеринбург");
        cities.add("Казань");
        cities.add("Нижний Новгород");
        cities.add("Нижний Новгород");
        cities.add("Челябинск");
        cities.add("Самара");
        cities.add("Омск");
        cities.add("Ростов-на-Дону");
        cities.add("Уфа");
        cities.add("Красноярск");
        cities.add("Воронеж");
        cities.add("Воронеж");
        cities.add("Калуга");
        cities.add("Волгоград");
        cities.add("Волгоград");
        cities.add("Иркутск");

        Set<String> uniqueCities = new HashSet<>(cities);
        System.out.println(uniqueCities);

        HashMap<String, Integer> repeatWords = new HashMap<>();

        for (String city : cities) {
            if(!repeatWords.containsKey(city)) {
                repeatWords.put(city, 1);
            } else {
                Integer cnt = repeatWords.get(city);
                repeatWords.put(city, ++cnt);
            }
        }

        System.out.println(repeatWords);
    }

}
