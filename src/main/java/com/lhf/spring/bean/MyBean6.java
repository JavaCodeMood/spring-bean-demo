package com.lhf.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBean6
 * @Description:  简单类型的注入，比如String,Integer
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Component
public class MyBean6 {


    private String string;

    private Integer integer;

    public String getString() {
        return string;
    }

    @Value("没有了你，万杯觥筹只不是是提醒寂寞罢了")  //使用@Value注解直接注入值
    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    @Value("1314")
    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "MyBean6{" +
                "string='" + string + '\'' +
                ", integer=" + integer +
                '}';
    }
}
