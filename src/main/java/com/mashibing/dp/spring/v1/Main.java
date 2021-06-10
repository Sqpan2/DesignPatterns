package com.mashibing.dp.spring.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Vector;
import java.util.concurrent.*;

/**
 * spring aop test
 */

public class Main {
    public static void main(String[] args) {

        //XML方式
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Tank t = (Tank) context.getBean("tank");
        t.move();

        //JavaConfig方式
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();

        //ThreadLocal.ThreadLocalMap.Entry --> Object value;
        ThreadLocal<String> stringThreadLocal = new ThreadLocal<String>();
        final Thread thread = new Thread();

        //Vector线程安全实现方式synchronized
        Vector<String> strings = new Vector<String>();

        //Set内部使用的是HashMap
        HashSet<String> strings1 = new HashSet<String>();

        



    }
}
