package com.tim15.projekat.service;

import com.tim15.projekat.jaxb.JaxbParser;
import com.tim15.projekat.jenafuseki.FusekiWriterExample;
import com.tim15.projekat.jenafuseki.MetadataExtractor;
import com.tim15.projekat.model.zalbacutanjecir.Zalbacutanje;
import com.tim15.projekat.repository.ZalbacutanjecirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.IOException;

@Service
public class ZalbacutanjecirService {
    @Autowired
    private ZalbacutanjecirRepository zalbacutanjecirRepository;

    private JaxbParser jaxbParser;
    private MetadataExtractor metadataExtractor;

    public ZalbacutanjecirService() throws IOException, SAXException {
        jaxbParser = new JaxbParser();
        metadataExtractor = new MetadataExtractor();
    }

    public void addZalbacutanjeFromText(String text) throws Exception {
        Zalbacutanje zalba = jaxbParser.unmarshall(Zalbacutanje.class, text);
        String docId = zalba.getNaslov(); //za sada naslov, dok ne modelujem dokument bolje
        zalbacutanjecirRepository.saveZalbacutanjecirFromText(text, docId);
        metadataExtractor.extractMetadata(text);
        FusekiWriterExample.saveRDF();
    }

    public void addZalbacutanjeFromFile(String path) throws Exception {
        Zalbacutanje zalba = jaxbParser.unmarshallFile(Zalbacutanje.class, path);
        String docId = zalba.getNaslov();
        zalbacutanjecirRepository.saveZalbacutanjecirFromFile(path, docId);
        String text = jaxbParser.marshallString(Zalbacutanje.class, zalba);
        metadataExtractor.extractMetadata(text);
        FusekiWriterExample.saveRDF();
    }

    public Document getZalbacutanjeDocument(String docId) throws Exception {
        Document doc = zalbacutanjecirRepository.findZalbacutanjecirById(docId);
        return doc;
    }
}
