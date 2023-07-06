// Create a collection of at least five Person objects with first name & last name fields. Add a
// few null objects to the collection in random places. Use an enhanced for-loop to iterate
// over the collection and print out the first names of each person. Use Optional to prevent
// NullPointerException and to print “Unknown” for the first names of null items.
//   1. Use the Optional API to display “Unknown” for null entries and entries whose first name
//      is shorter than 3 characters.

package com.gianmarco.ends;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Exercise3 {
    record Person(String firstName, String lastName) {}

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Mario", "Rossi"));
        people.add(new Person("Francesco", "Rossi"));
        people.add(null);
        people.add(new Person("Marco", "Benvenuti"));
        people.add(new Person("Maria", "Bemvemuti"));
        people.add(null);
        people.add(new Person("Fra", "Francesto")); // test ex 3.1

        for (Person person : people) {
            System.out.println(
                    Optional.ofNullable(person)
                            .map(p -> p.firstName)
                            .filter(n -> n.length() > 3) // 3.1
                            .orElse("Unknown")
            );
        }
    }
}
