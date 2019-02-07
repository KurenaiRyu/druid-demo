package com.kurenai.demo.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author 刘富鸿
 * @create 2019-02-07 19:10
 */

@WebServlet(urlPatterns = "/druid/*",
        initParams = {@WebInitParam(name = "allow", value = ""),
                @WebInitParam(name = "deny", value = ""),
                @WebInitParam(name = "loginUsername", value = "admin"),
                @WebInitParam(name = "loginPassword", value = "admin")
        })
public class DruidServlet extends StatViewServlet {
}
