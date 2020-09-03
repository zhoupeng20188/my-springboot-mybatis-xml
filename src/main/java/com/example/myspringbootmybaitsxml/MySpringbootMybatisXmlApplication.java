package com.example.myspringbootmybaitsxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class MySpringbootMybatisXmlApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(MySpringbootMybatisXmlApplication.class, args);
        DataSource dataSource = (DataSource) ca.getBean("dataSource");
        try {
            System.out.println(dataSource);
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
