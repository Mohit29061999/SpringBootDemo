package com.org.springBootDemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Override
    public List<Person> getPersonList() {
        Person person = new Person("temp",1);
        Person person2 = new Person("temp1",2);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        return personList;
    }
}
