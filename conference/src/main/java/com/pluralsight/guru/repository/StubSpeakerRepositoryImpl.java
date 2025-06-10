package com.pluralsight.guru.repository;

import com.pluralsight.guru.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Guru");
        speaker.setLastName("Chundi");

        speakers.add(speaker);

        return speakers;
    }
}
