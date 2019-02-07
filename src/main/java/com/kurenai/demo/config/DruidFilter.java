package com.kurenai.demo.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author 刘富鸿
 * @create 2019-02-07 19:16
 */

@WebFilter(urlPatterns = "/*", initParams = {@WebInitParam(name = "exclusions", value = "*.js, *.css, *.gif, *.jpg, *.ico, *.bmp, *.png, /druid/*")})
public class DruidFilter extends WebStatFilter {
}
