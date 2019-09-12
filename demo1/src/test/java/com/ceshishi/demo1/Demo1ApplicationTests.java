package com.ceshishi.demo1;

import com.ceshishi.demo1.core.Contact;
import com.ceshishi.demo1.core.Person;
import com.ceshishi.demo1.repository.ContactReprository;
import com.ceshishi.demo1.service.ContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    DataSource dataSource;

    @Autowired
    ContactReprository contactReprository;

    @Autowired
    ContactService contactService;


    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection+"------------");
        connection.close();
//        System.out.println(person);
    }

    @Test
    public void test1(){
        Contact contact = contactReprository.getAllByContactId(1);
        System.out.println(contact);
    }

    @Test
    public void test2(){
        List<Contact> contactList = contactReprository.queryAllByMobile("132");
        System.out.println(contactList);
    }

    @Test
    public void test3(){
        contactService.updateContactById(1,"18739755503");

    }
}
