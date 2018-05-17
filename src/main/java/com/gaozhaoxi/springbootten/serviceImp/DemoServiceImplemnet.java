package com.gaozhaoxi.springbootten.serviceImp;

import com.gaozhaoxi.springbootten.entity.Person;
import com.gaozhaoxi.springbootten.repository.PersonRepository;
import com.gaozhaoxi.springbootten.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Leon
 */
@Service
public class DemoServiceImplemnet implements DemoService {
    @Autowired
    PersonRepository personRepository;



    @Transactional(rollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithRollBack(Person person) {
        Person p=personRepository.save(person);
        if(person.getName().equals("gaozhaoxi")){
            throw new IllegalArgumentException("gao已经存在，数据将回滚");
        }
        return p;
    }

    @Override
   // @Transactional(noRollbackFor = {IllegalArgumentException.class})
    @javax.transaction.Transactional(dontRollbackOn = {IllegalArgumentException.class})
    public Person savePersonWithoutRollBack(Person person) {
        Person p=personRepository.save(person);
        if(person.getName().equals("gaozhaoxi")){
            throw  new IllegalArgumentException("gao已经存在，但是数据不回滚");
        }

        return p;
    }
}
