package com.pluralsight;


import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

/*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        // constructor injection
        // SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        // auto wiring
        SpeakerServiceImpl service = new SpeakerServiceImpl();

        // setter injection
        // service.setSpeakerRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository  getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
*/

}
