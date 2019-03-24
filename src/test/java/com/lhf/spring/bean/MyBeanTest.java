package com.lhf.spring.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @ClassName: MyBean1Test
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/3/24
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class MyBeanTest {

    ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

    //构造方法注入Bean
    @Test
    public void testMyBean1(){
        MyBean1 myBean1 = context.getBean("myBean1", MyBean1.class);
        System.out.println("MyBean1 = " + myBean1);
    }

    //Set方法注入Bean
    @Test
    public void testMyBean2(){
        MyBean2 myBean2 = context.getBean("myBean2", MyBean2.class);
        System.out.println("MyBean2 = " + myBean2);
    }

    //属性注入Bean
    @Test
    public void testMyBean3(){
        MyBean3 myBean3 = context.getBean("myBean3", MyBean3.class);
        System.out.println("MyBean3 = " + myBean3);
    }

    //List集合注入Bean，方式二的优先级高于方式一
    //方式二采用的是集合泛型注入
    @Test
    public void testMyBean4(){
        MyBean4 myBean4 = context.getBean("myBean4", MyBean4.class);
        for (String s : myBean4.getStringList()){
            System.out.println("s == " + s);
        }

        for (String s1 : myBean4.getStringList1()){
            System.out.println("s1 == " + s1);
        }

    }

    //Map集合注入Bean, 方式二的优先级高于方式一
    //方式二采用的是集合泛型注入
    @Test
    public void testMyBean5(){
        MyBean5 myBean5 = context.getBean("myBean5", MyBean5.class);
        for(Map.Entry<String, Integer> map : myBean5.getIntegerMap().entrySet()){
            System.out.println("map = " + map);
        }

    }

    //简单类型注入Bean
    @Test
    public void testMyBean6(){
        MyBean6 myBean6 = context.getBean("myBean6", MyBean6.class);
        System.out.println("MyBean6 = " + myBean6);
    }

    //springIoc内置接口实例注入
    @Test
    public void testMyBean7(){
        MyBean7 myBean7 = context.getBean("myBean7", MyBean7.class);
        MyBean1 myBean1 = myBean7.getContext().getBean("myBean1", MyBean1.class);
        System.out.println("myBean1 = " + myBean1);
    }


}
