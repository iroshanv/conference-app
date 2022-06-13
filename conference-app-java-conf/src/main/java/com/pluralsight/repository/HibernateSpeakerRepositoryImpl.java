package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// all db crud operation

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers =new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("roshan");
        speaker.setLastName("v");

        speakers.add(speaker);

        return speakers;
    }

}
