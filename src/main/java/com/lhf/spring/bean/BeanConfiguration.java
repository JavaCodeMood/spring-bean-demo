package com.lhf.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: BeanConfiguration
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Configuration
@ComponentScan("com.lhf.spring.bean")
public class BeanConfiguration {

    //方式一： List集合注入Bean
    @Bean   //告知这个Bean将会交给Spring进行管理
    public List<String> stringList(){
        //List集合有序可重复
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        return list;
    }

    @Bean("stringList1")   //告知这个Bean将会交给Spring进行管理, 指定Bean的Id
    public List<String> stringList1(){
        //List集合有序可重复
        List<String> list = new ArrayList<String>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        return list;
    }

    //方式二：List集合注入Bean，   注意类型一定要与List集合的类型一致
    @Bean
    @Order(100)  //@Order注解指定顺序
    public String string1(){
        return "444";
    }
    @Bean
    @Order(1)
    public String string2(){
        return "555";
    }
    @Bean
    @Order(50)
    public String string3(){
        return "666";
    }

    //----------------------------------------------------------------//
    //方式一：Map集合注入Bean
    @Bean
    public Map<String, Integer> integerMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 1111);
        map.put("bbb", 2222);
        map.put("ccc", 3333);
        return map;
    }

    //方式二：Map集合注入Bean,  注意类型一定要与Map集合的类型一致
    @Bean("int1")
    public Integer integer1(){
        return 10001;
    }
    @Bean("int2")
    public Integer integer2(){
        return 10002;
    }


}
