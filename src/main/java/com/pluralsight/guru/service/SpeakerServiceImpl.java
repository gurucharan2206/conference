package com.pluralsight.guru.service;

import com.pluralsight.guru.model.Speaker;
import com.pluralsight.guru.repository.SpeakerRepository;
import com.pluralsight.guru.repository.StubSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new StubSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
