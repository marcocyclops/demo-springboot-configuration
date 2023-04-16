package com.marco.demoyaml;

import com.marco.demoyaml.bean.Person;
import com.marco.demoyaml.bean.PersonPs;
import com.marco.demoyaml.bean.PersonV;
import com.marco.demoyaml.bean.PersonZ;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

// unit test
@RunWith(SpringRunner.class)
@SpringBootTest
class DemoYamlApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private PersonV personv;

    @Autowired
    private PersonPs personPs;

    @Autowired
    private ApplicationContext ioc;
    @Autowired
    private PersonZ personZ;

    @Test
    void testAnnotationAddBeanToContainer() {
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(personv);
        System.out.println(personPs);
        System.out.println(personZ);
    }

}
