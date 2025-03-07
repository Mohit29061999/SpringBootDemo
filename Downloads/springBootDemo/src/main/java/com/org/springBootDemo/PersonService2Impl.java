package com.org.springBootDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class PersonService2Impl implements PersonService{
    @Override
    public List<Person> getPersonList() {
        Person person = new Person("tempof2",1);
        Person person2 = new Person("tempof2.1",2);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        return personList;
    }
}
