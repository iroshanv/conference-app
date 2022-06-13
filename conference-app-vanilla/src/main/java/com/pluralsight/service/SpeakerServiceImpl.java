package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    // hard-coded reference, changing imp leads to compile whole code
    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

}
