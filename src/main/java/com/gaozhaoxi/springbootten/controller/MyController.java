package com.gaozhaoxi.springbootten.controller;

import com.gaozhaoxi.springbootten.entity.Person;
import com.gaozhaoxi.springbootten.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leon
 */
@RestController
public class MyController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/norollback")
    public Person noRollback(Person person){
        return demoService.savePersonWithoutRollBack(person);
    }

    @RequestMapping("/rollback")
    public Person rollback(Person person){
        return demoService.savePersonWithRollBack(person);
    }
}
