package com.pluralsight.guru.repository;

import com.pluralsight.guru.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
