package com.kurenai.demo;

import com.kurenai.demo.entity.Customer;
import com.kurenai.demo.mapper.CustomerMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ServletComponentScan
public class DemoApplicationTests {

    @Resource
    private CustomerMapper customerMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void mybatisPlusTest() {
        List<Customer> customers = customerMapper.selectList(null);
        Assert.assertEquals(6, customers.size());
        customers.forEach(System.out::println);
    }

}

