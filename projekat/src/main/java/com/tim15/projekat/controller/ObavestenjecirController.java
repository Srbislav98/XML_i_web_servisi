package com.tim15.projekat.controller;

import com.tim15.projekat.dto.TestDTO;
import com.tim15.projekat.service.ObavestenjecirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Document;

@RestController
@RequestMapping(value = "api/obavestenja", produces = MediaType.APPLICATION_JSON_VALUE)
public class ObavestenjecirController {
    @Autowired
    private ObavestenjecirService obavestenjecirService;

    @PostMapping(value = "/addText", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addObavestenjeText(@RequestBody TestDTO testDTO) throws Exception {
        obavestenjecirService.addObavestenjeFromText(testDTO.getText());
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }

    @PostMapping(value = "/addFile", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addObavestenjeFile(@RequestBody String path) throws Exception {
        obavestenjecirService.addObavestenjeFromFile(path);
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }

    @GetMapping(value = "/getDocument/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Document> getObavestenjeDocument(@PathVariable String id) throws Exception {
        Document document = obavestenjecirService.getObavestenjeDocument(id);
        if(document == null) {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(document, HttpStatus.OK);
    }
}
