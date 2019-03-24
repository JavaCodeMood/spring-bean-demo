package com.lhf.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBean
 * @Description:  构造方法注入Bean
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Component
public class MyBean1 {

    private AnotherBean anotherBean1;

    public MyBean1(AnotherBean anotherBean1) {
        this.anotherBean1 = anotherBean1;
    }

    @Override
    public String toString() {
        return "MyBean1{" +
                "anotherBean1=" + anotherBean1 +
                '}';
    }
}
