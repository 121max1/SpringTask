package com.maxshkodin.spring.di;

import com.maxshkodin.spring.repository.ClientRepository;
import com.maxshkodin.spring.repository.DoctorRepository;
import com.maxshkodin.spring.repository.RecordRepository;
import com.maxshkodin.spring.repository.fake_impl.ClientRepositoryFakeImpl;
import com.maxshkodin.spring.repository.fake_impl.DoctorRepositoryFakeImpl;
import com.maxshkodin.spring.repository.fake_impl.RecordRepositoryFakeImpl;
import com.maxshkodin.spring.service.ClientService;
import com.maxshkodin.spring.service.DoctorService;
import com.maxshkodin.spring.service.RecordService;
import com.maxshkodin.spring.service.impl.ClientServiceImpl;
import com.maxshkodin.spring.service.impl.DoctorServiceImpl;
import com.maxshkodin.spring.service.impl.RecordServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean
    public ClientRepository clientFakeRepository(){
        return new ClientRepositoryFakeImpl();
    }

    @Bean
    public DoctorRepository doctorFakeRepository(){
        return new DoctorRepositoryFakeImpl();
    }

    @Bean
    public RecordRepository recordFakeRepository(){
        return new RecordRepositoryFakeImpl();
    }

    @Bean
    public ClientService clientService(){
        return new ClientServiceImpl();
    }

    @Bean
    public DoctorService doctorService(){
        return new DoctorServiceImpl();
    }

    @Bean
    public RecordService recordService(){
        return new RecordServiceImpl();
    }

}
