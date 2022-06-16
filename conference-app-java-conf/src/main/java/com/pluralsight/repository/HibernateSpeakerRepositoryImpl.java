package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import com.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// all db crud operation

@Repository("speakerRepository")
//@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers =new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("roshan");
        speaker.setLastName("v");
        speaker.setSeed(seedNum);

        speakers.add(speaker);

        System.out.println("cal : " +  calendar.getTime());

        return speakers;
    }

}
