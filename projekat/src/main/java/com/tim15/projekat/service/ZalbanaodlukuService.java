package com.tim15.projekat.service;

import com.tim15.projekat.repository.ZalbanaodlukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZalbanaodlukuService {

    @Autowired
    private ZalbanaodlukuRepository zalbanaodlukuRepository;

    public void saveZalbanaodlukuFromString(String text) throws Exception {
        zalbanaodlukuRepository.save(text);
    }
}
