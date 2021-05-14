package holding.exercise;

import typeinfo.pets.*;

import java.util.*;

public class Exercise18 {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();
    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"),
                        new Cat("Stanford aka Stinky el Negro"),
                        new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        System.out.println(petPeople);
        Map<Person, List<? extends Pet>> petPeopleSorted = new LinkedHashMap<>();
        Set<Person> peopleSorted = new TreeSet<>(petPeople.keySet());
        for (Person p : peopleSorted) {
            petPeopleSorted.put(p, petPeople.get(p));
        }
        System.out.print(petPeopleSorted);
    }
}
