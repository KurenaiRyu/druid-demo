package com.kurenai.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kurenai.demo.entity.Customer;
import org.springframework.stereotype.Repository;

/**
 * @author 刘富鸿
 * @create 2019-02-07 17:14
 */

@Repository
public interface CustomerMapper extends BaseMapper<Customer> {
}
