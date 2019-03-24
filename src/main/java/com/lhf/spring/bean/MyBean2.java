package com.lhf.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBean2
 * @Description:  Set方法注入Bean
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Component
public class MyBean2 {

    private AnotherBean anotherBean2;

    @Autowired
    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }

    @Override
    public String toString() {
        return "MyBean2{" +
                "anotherBean2=" + anotherBean2 +
                '}';
    }
}
