package ru.treut.test.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.treut.test.models.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Component
public class PersonDAO {
    private Connection connecta;

    public PersonDAO(@Value("${sql.url}") String url, @Value("${sql.user}") String user, @Value("${sql.password}") String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connecta = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public List<Person> index(){
        List<Person> people = new ArrayList<>();
        try{
            Statement st = connecta.createStatement();
            ResultSet res = st.executeQuery("SELECT card, person FROM cards LIMIT 20");

            while(res.next()){
                people.add(new Person(res.getInt("card"), res.getString("person")));
            }

            res.close();
            st.close();
//            connecta.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return people;

    }

//    public Person show(int id){
//        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
//    }

    public void save(Person person){
//        person.setId(++counter);
//        people.add(person);
    }
}
