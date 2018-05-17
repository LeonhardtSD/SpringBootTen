package com.gaozhaoxi.springbootten.service;

import com.gaozhaoxi.springbootten.entity.Person;

/**
 * @author Leon
 */
public interface DemoService {
    public Person savePersonWithRollBack(Person person);

    public Person savePersonWithoutRollBack(Person person);
}
