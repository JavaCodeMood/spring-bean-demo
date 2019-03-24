package com.lhf.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: MyBean4
 * @Description: 集合类型注入——List
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Component
public class MyBean4 {

    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    @Autowired
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    private List<String> stringList1;

    public List<String> getStringList1() {
        return stringList1;
    }

    @Autowired
    @Qualifier("stringList1")   //使用@Qualifier注解指定bean的Id，此处的Id与BeanConfiguration类中的stringList1方法的Bean 的Id要一致
    public void setStringList1(List<String> stringList1) {
        this.stringList1 = stringList1;
    }

    @Override
    public String toString() {
        return "MyBean4{" +
                "stringList=" + stringList +
                ", stringList1=" + stringList1 +
                '}';
    }
}
