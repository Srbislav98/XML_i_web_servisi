package com.tim15.projekat.controller;

import com.tim15.projekat.dto.TestDTO;
import com.tim15.projekat.service.ObavestenjecirService;
import com.tim15.projekat.service.ZahtevicirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Document;

@RestController
@RequestMapping(value = "api/zahtevi", produces = MediaType.APPLICATION_JSON_VALUE)
public class ZahtevicirController {
    @Autowired
    private ZahtevicirService zahtevicirService;

    @PostMapping(value = "/addText", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addZahtevText(@RequestBody TestDTO testDTO) throws Exception {
        zahtevicirService.addZahtevFromText(testDTO.getText());
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }

    @PostMapping(value = "/addFile", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addZahtevFile(@RequestBody String path) throws Exception {
        zahtevicirService.addZahtevFromFile(path);
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }

    @GetMapping(value = "/getDocument/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Document> getZahtevDocument(@PathVariable String id) throws Exception {
        Document document = zahtevicirService.getZahtevDocument(id);
        if(document == null) {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(document, HttpStatus.OK);
    }
}
