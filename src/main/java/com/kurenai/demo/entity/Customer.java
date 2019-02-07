package com.kurenai.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author 刘富鸿
 * @create 2019-02-07 17:11
 */

@Data
public class Customer {
    @TableId
    private String id;
    private String firstName;
    private String lastName;
}
