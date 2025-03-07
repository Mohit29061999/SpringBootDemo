package com.org.springBootDemo;

import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonService {

    List<Person> getPersonList();
}
