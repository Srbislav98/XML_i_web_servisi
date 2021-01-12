package com.tim15.projekat.repository;

import com.tim15.projekat.existdb.ExistManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.Document;
import org.xmldb.api.modules.XMLResource;

@Repository
public class ResenjaRepository {
    @Autowired
    ExistManager existManager;

    private String collectionId = "/existdb/resenja";

    public void saveResenjeFromText(String text, String id) throws Exception {
        existManager.storeFromText(collectionId, id , text);
    }

    public void saveResenjeFromFile(String path, String id) throws Exception {
        existManager.store(collectionId, id, path);
    }

    public Document findResenjeById(String id) throws Exception {
        XMLResource xmlResource = existManager.load(collectionId, id);
        Document document = (Document) xmlResource.getContentAsDOM();
        return document;
    }
}
