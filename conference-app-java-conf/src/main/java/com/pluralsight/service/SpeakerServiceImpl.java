package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
//@Scope
public class SpeakerServiceImpl implements SpeakerService {

    // #1 hard-coded reference, changing imp leads to compile whole code
    // private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl;

    // @Autowired
    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl(){}

    // #2 constructor injection from configuration file using @Bean
    @Autowired // #3 constructor auto-wiring
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    // #2 setter injection from configuration file using @bean
    // @Autowired // #3 method auto-wiring
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

}
