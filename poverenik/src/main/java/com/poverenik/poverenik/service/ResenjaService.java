package com.poverenik.poverenik.service;

import com.poverenik.poverenik.dom.DOMParser;
import com.poverenik.poverenik.jenafuseki.FusekiWriterExample;
import com.poverenik.poverenik.jenafuseki.MetadataExtractor;
import com.poverenik.poverenik.repository.ResenjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;

@Service
public class ResenjaService {
    @Autowired
    private ResenjaRepository resenjaRepository;

    private DOMParser domParser;
    private MetadataExtractor metadataExtractor;

    public ResenjaService() throws IOException, SAXException {
        metadataExtractor = new MetadataExtractor();
        domParser = new DOMParser();
    }

    public void addResenjeFromText(String text) throws Exception {
        Document document = domParser.buildDocumentFromText(text);
        NodeList ndBroj = document.getElementsByTagName("broj_zalbe");
        String docId = ndBroj.item(0).getTextContent();
        resenjaRepository.saveResenjeFromText(text, docId);
        metadataExtractor.extractMetadataResenje(text);
        FusekiWriterExample.saveRDFResenje();
    }

    public void addResenjeFromFile(String path) throws Exception {
        Document document = domParser.buildDocumentFromFile(path);
        NodeList ndBroj = document.getElementsByTagName("broj_zalbe");
        String docId = ndBroj.item(0).getTextContent();
        resenjaRepository.saveResenjeFromFile(path, docId);
        String text = domParser.getDocumentAsString(document);
        metadataExtractor.extractMetadata(text);
        FusekiWriterExample.saveRDF();
    }

    public Document getResenjeDocument(String docId) throws Exception {
        Document doc = resenjaRepository.findResenjeById(docId);
        return doc;
    }
}
