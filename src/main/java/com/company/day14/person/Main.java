package com.company.day14.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication

public class Main {
//@Bean
public Person getPerson(){
    return new Person();

}
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        System.out.println("application");
        Address bean = applicationContext.getBean(Address.class);
        System.out.println(bean + " created");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }

    @Bean
    //@Lazy
    public Address getAddress_bean() {
        return new Address("street", "city", 123l);
    }
}
