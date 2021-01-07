package com.zsl;

import com.zsl.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.register(UserDao.class);
        context.refresh();
        UserDao userDao = context.getBean(UserDao.class);
        userDao.query();
    }
}
