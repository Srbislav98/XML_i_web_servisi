package com.tim15.projekat.service;

import com.tim15.projekat.jaxb.JaxbParser;
import com.tim15.projekat.jenafuseki.FusekiWriterExample;
import com.tim15.projekat.jenafuseki.MetadataExtractor;
import com.tim15.projekat.model.zahtevcir.Zahtev;
import com.tim15.projekat.repository.ZahtevicirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.IOException;

@Service
public class ZahtevicirService {
    @Autowired
    private ZahtevicirRepository zahtevicirRepository;

    private JaxbParser jaxbParser;
    private MetadataExtractor metadataExtractor;

    public ZahtevicirService() throws IOException, SAXException {
        jaxbParser = new JaxbParser();
        metadataExtractor = new MetadataExtractor();
    }

    public void addZahtevFromText(String text) throws Exception {
        Zahtev zahtev = jaxbParser.unmarshall(Zahtev.class, text);
        String docId = zahtev.getNaslov();
        zahtevicirRepository.saveZahtevFromText(text, docId);
        metadataExtractor.extractMetadata(text);
        FusekiWriterExample.saveRDF();
    }

    public void addZahtevFromFile(String path) throws Exception {
        Zahtev zahtev = jaxbParser.unmarshallFile(Zahtev.class, path);
        String docId = zahtev.getNaslov();
        zahtevicirRepository.saveZahtevFromFile(path, docId);
        String text = jaxbParser.marshallString(Zahtev.class, zahtev);
        metadataExtractor.extractMetadata(text);
        FusekiWriterExample.saveRDF();
    }

    public Document getZahtevDocument(String docId) throws Exception {
        Document doc = zahtevicirRepository.findZahtevById(docId);
        return doc;
    }
}
