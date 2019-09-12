package com.ceshishi.demo1.repository;

import com.ceshishi.demo1.core.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成对数据库的操作
public interface DogRepository extends JpaRepository<Dog,Integer> {
}
