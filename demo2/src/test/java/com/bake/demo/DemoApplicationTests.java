package com.bake.demo;

import com.bake.demo.model.Bed;
import com.bake.demo.service.BedService;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    BedService bedService;


    @Test
    public void contextLoads() {
        Bed bed = new Bed();
        bed.setLength("1");
        bed.setWide("2");
        bed.setHouseId(27);
        boolean b = bedService.insert(bed);
        System.out.println(b);
    }

    @Test
    public void test1(){
        bedService.queryPageNew(new Page(1,1));
//        bedService.selectPage(new Page<Bed>(1,1));
    }

    @Test
    public void test2(){
        bedService.queryAll();
    }

    @Test
    public void test3(){
        List<Bed> list = bedService.queryTest();
        for (Bed bed : list) {
            System.out.println(bed);
        }

    }
}
