package com.test.demo;

import com.test.demo.core.*;
import com.test.demo.repository.BedReprository;
import com.test.demo.repository.ContactReprository;
import com.test.demo.repository.CustomerReprository;
import com.test.demo.repository.HouseReprository;
import com.test.demo.repository.HouseAndBedReprository;
import com.test.demo.service.ContactService;
import com.test.demo.util.EmptyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    Shop shop;

    @Autowired
    ApplicationContext ioc;

    @Autowired
    ContactReprository contactReprository;

    @Autowired
    CustomerReprository customerReprository;

    @Autowired
    ContactService contactService;

    @Autowired
    HouseReprository houseReprository;

    @Autowired
    BedReprository bedReprository;

    @Autowired
    HouseAndBedReprository houseAndBedReprository;

    @Test
    public void contextLoads() {
        System.out.println(person);
//        System.out.println(shop);
//        boolean b =ioc.containsBean("demoService");//判断容器中是否有该组件
//        System.out.println(b);
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

    @Test
    public void test4(){
        Customer customer = customerReprository.getCustomerByCustomerId(1);
        System.out.println(customer);
    }

    @Test
    public void test5(){
        Customer customer = new Customer();
        customer.setName("赵能");
        customer.setBirth(new Date());
        customer.setNickName("小能");
        customer.setSex("1");
        Contact contact = new Contact();
        contact.setMobile("15739575688");
        Set<Contact> contacts = new HashSet<>();
        contacts.add(contact);
        customer.setContacts(contacts);
        customerReprository.save(customer);
    }

    @Test
    public void test6(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Customer> customers = customerReprository.findAllById(list);
        System.out.println(customers.get(0).getName());
    }

    @Test
    public void test7(){
        Optional<Customer> customerOptional = customerReprository.findById(1);
        Customer customer = customerOptional.get();
//        System.out.println(customer.getName());
        customer.setName("大明");
        customerReprository.save(customer);
    }

    @Test
    public void test8(){
        HouseEntity houseEntity = new HouseEntity();
        houseEntity.setArea("120");
        houseEntity.setPrice("13000");
        HouseEntity houseEntityTemp =  houseReprository.saveAndFlush(houseEntity);
        BedEntity bedEntity = new BedEntity();
        bedEntity.setLength("2");
        bedEntity.setWide("1.8");
        bedEntity.setHouseId(houseEntityTemp.getHouseId());
        BedEntity bedEntityTemp = (BedEntity) bedReprository.save(bedEntity);
        System.out.println(houseEntityTemp.getHouseId()+","+bedEntityTemp.getBedId());
    }

    @Test
    public void test9(){
//        bedReprository.getAllByLength("1");
        List<HouseAndBed> houseAndBeds = houseAndBedReprository.getHouseAndBedByBedId();
        System.out.println(houseAndBeds.get(0));
    }

    @Test
    public void test10(){
//        List<BedAndHouse> bedAndHouses = houseAndBedReprository.getBedAndHouse(23);
//        System.out.println(bedAndHouses.get(0).getPrice());
        List<BedAndHouse> bedAndHouseList = houseAndBedReprository.getBedNumInHouse(23);
        System.out.println(bedAndHouseList.size()+","+bedAndHouseList.get(0).getCountBed());
    }

    @Test
    public void test11() throws Exception {
        HouseEntity houseEntity = houseReprository.findById(23).get();
        Integer houseId = houseEntity.getHouseId();
        HouseEntity houseEntityTemp = new HouseEntity();
        houseEntityTemp.setPrice("1000");
        houseEntityTemp.setArea("90");
        EmptyUtil.Copy(houseEntityTemp,houseEntity,true);
        houseEntity.setHouseId(houseId);
        System.out.println(houseEntity.getPrice()+","+houseEntity.getArea());
        houseReprository.save(houseEntity);
    }
}
