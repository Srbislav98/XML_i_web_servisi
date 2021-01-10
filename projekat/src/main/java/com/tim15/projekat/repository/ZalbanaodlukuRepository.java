package com.tim15.projekat.repository;

import com.tim15.projekat.existdb.ExistManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ZalbanaodlukuRepository {

    @Autowired
    ExistManager existManager;

    private String collectionId = "/existdb/zalbenaodluku";

    public void save(String text) throws Exception {
        // nisam siguran da li document id moze biti proizvoljan, za sada nek ide ovaj
        existManager.storeFromText(collectionId, "NovaZalbanaodluku", text);
    }


}
