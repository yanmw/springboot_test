package com.test.demo.repository;

import com.test.demo.core.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成对数据库的操作
public interface DogRepository extends JpaRepository<Dog,Integer> {
}
