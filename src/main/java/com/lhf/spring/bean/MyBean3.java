package com.lhf.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBean3
 * @Description: 属性注入Bean
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Component
public class MyBean3 {

    @Autowired
    private AnotherBean anotherBean3;

    @Override
    public String toString() {
        return "MyBean3{" +
                "anotherBean3=" + anotherBean3 +
                '}';
    }
}
