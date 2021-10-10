package com.maxshkodin.spring;

import com.maxshkodin.spring.di.AppConfig;
import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.service.ClientService;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class Task2Application {


    public static void main(String[] args) throws Exception {
        //SpringApplication.run(Task2Application.class, args);
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] springComponents = config.getBeanDefinitionNames();

        ClientService clientService = config.getBean(ClientService.class);

        clientService.add(new Client(1,"kek","+79675002042","x2w3g4@gmail.com","121max1","kek123"));
        clientService.add(new Client(2,"lol","+79675002042","x2w3g4@gmail.com","121max1","kek123"));
        for (Client client: clientService.getAll()) {
            System.out.println(client.getFullName());
        }
    }
}
