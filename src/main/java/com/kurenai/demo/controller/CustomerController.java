package com.kurenai.demo.controller;

import com.kurenai.demo.mapper.CustomerMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 刘富鸿
 * @create 2019-02-07 19:47
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerMapper mapper;

    public CustomerController(CustomerMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("")
    public List findAll() {
        return mapper.selectList(null);
    }
}
