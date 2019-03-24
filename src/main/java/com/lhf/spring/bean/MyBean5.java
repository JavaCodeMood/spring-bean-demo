package com.lhf.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName: MyBean5
 * @Description: 集合类型注入——Map
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Component
public class MyBean5 {

    private Map<String, Integer> integerMap;

    public Map<String, Integer> getIntegerMap() {
        return integerMap;
    }

    @Autowired  //加上@Autowired 注解是希望Spring帮我们完成注入
    public void setIntegerMap(Map<String, Integer> integerMap) {
        this.integerMap = integerMap;
    }

    @Override
    public String toString() {
        return "MyBean5{" +
                "integerMap=" + integerMap +
                '}';
    }
}
