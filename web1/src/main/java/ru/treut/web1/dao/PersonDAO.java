package ru.treut.web1.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import ru.treut.web1.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int counter;
    private List<Person> people;

    {
        people=new ArrayList<>();

        people.add(new Person(++counter, "Dron"));
        people.add(new Person(++counter, "Bondon"));
        people.add(new Person(++counter, "Dorson"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person->person.getId()==id).findAny().orElse(null);
    }
}
