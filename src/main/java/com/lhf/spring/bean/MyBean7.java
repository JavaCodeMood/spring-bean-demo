package com.lhf.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Mybean7
 * @Description: SpringIoc内置接口实例注入
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Component
public class MyBean7 {

    private ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }

    @Autowired
    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Mybean7{" +
                "context=" + context +
                '}';
    }
}
