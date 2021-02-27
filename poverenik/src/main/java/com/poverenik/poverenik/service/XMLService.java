/*package com.poverenik.poverenik.service;

import javax.xml.bind.JAXBContext;

import com.poverenik.poverenik.jenafuseki.FusekiReaderExample;
import com.poverenik.poverenik.jenafuseki.FusekiWriterExample;
import com.poverenik.poverenik.jenafuseki.MetadataExtractor;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.poverenik.poverenik.dom.DOMParser;
import com.poverenik.poverenik.dto.XMLDto;
import com.poverenik.poverenik.jaxb.JaxbParser;

import com.poverenik.poverenik.model.resenja.Resenje;
import com.poverenik.poverenik.model.obavestenjecir.Obavestenje;

import com.poverenik.poverenik.repository.ResenjaRepository;
import com.poverenik.poverenik.repository.ObavestenjecirRepository;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class XMLService {

    private final DOMParser domParser;
    private final JaxbParser jaxB;
    private final ResenjaRepository resenjaRepository;
    //private final ObavestenjecirRepository obavestenjecirRepository;
    private final MetadataExtractor metadataExtractor;

    public XMLService(DOMParser domParser, JaxbParser jaxB, ResenjaRepository resenjaRepository, MetadataExtractor metadataExtractor) {
        this.domParser = domParser;
        this.jaxB = jaxB;
        this.resenjaRepository = resenjaRepository;
        this.metadataExtractor = metadataExtractor;
    }

    public String playWithXML(XMLDto dto) throws Exception {
        Document document = domParser.buildDocumentFromText(dto.getText());
        NodeList profesori = document.getElementsByTagName("profesor");

        for (int i = 0; i < profesori.getLength(); i++) {
            Element profesor = (Element) profesori.item(i);
            profesor.setAttribute("id", "prof" + i);

            Element titula = document.createElement("Titila");
            titula.appendChild(document.createTextNode("Profesor"));
            profesor.appendChild(titula);
        }

        return domParser.getDocumentAsString(document);

    }

    public String jaxBTest(XMLDto dto) throws Exception {
        JAXBContext context = JAXBContext.newInstance(Resenje.class);


        Resenje user = (Resenje) jaxB.unmarshall(Resenje.class, dto.getText());
        //user. = "novo ime";
        //user.email = "novi email";
        //System.out.println(user.id);

        return jaxB.marshall(User.class, user);


    }

    public void saveFileFromString(String text) throws Exception {
        resenjaRepository.saveResenjeFromText(text);
        metadataExtractor.extractMetadata(text);
        FusekiWriter.saveRDF();
    }

    public ArrayList<String> searchByMetadata(String naziv, String godina) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("naziv", naziv);
        params.put("godina", godina);

        ArrayList<String> result = FusekiReader.executeQuery(params);
        return result;
    }

}
*/