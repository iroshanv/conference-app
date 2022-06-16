package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import com.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// all db crud operation

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    Calendar calendar;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers =new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("roshan");
        speaker.setLastName("v");

        speakers.add(speaker);

        System.out.println("cal : " +  calendar.getTime());

        return speakers;
    }

}
