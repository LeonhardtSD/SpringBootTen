package com.gaozhaoxi.springbootten.repository;

import com.gaozhaoxi.springbootten.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Leon
 */
public interface PersonRepository extends JpaRepository<Person,Long>{

}
