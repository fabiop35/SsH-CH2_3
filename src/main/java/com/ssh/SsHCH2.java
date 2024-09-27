package com.ssh;

import com.ssh.bean.Parrot;
import com.ssh.bean.Person;
import com.ssh.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SsHCH2 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("*Person's name: " + p.getName());
        System.out.println("*Parrot's name: " + parrot.getName());
        System.out.println("*Person's parrot: " + p.getParrot());


    }
}
