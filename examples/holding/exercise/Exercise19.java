package holding.exercise;

import typeinfo.pets.Person;

import java.util.*;

public class Exercise19 {
    public static HashSet<Person> people = new HashSet<>();
    static {
        Collections.addAll(people, new Person("Dawn"), new Person("Kate"), new Person("Marilyn"),
                new Person("Luke"), new Person("Isaac"));
    }

    public static void main(String[] args) {
        System.out.println(people);
        Set<Person> peopleSorted = new LinkedHashSet<>();
        Set<Person> sortPeople = new TreeSet<>(people);
        peopleSorted.addAll(sortPeople);
        System.out.println(peopleSorted);
    }
}
