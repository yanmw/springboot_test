package com.test.demo.mapper;

import com.test.demo.core.Dog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

//@Mapper
public interface DemoMapper {

    @Delete("delete from dog where id = #{id}")
    public int deleteDog(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into dog(sex) values(#{sex})")
    public int insertDog(Dog dog);
}
