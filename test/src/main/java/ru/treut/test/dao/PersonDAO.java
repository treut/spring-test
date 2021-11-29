package ru.treut.test.dao;

import org.springframework.stereotype.Component;
import ru.treut.test.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private int counter;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++counter, "Tom"));
        people.add(new Person(++counter, "John"));
        people.add(new Person(++counter, "Monn"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++counter);
        people.add(person);
    }
}
