package com.tim15.projekat.controller;

import com.tim15.projekat.dto.TestDTO;
import com.tim15.projekat.service.ResenjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Document;

@RestController
@RequestMapping(value = "api/resenja", produces = MediaType.APPLICATION_JSON_VALUE)
public class ResenjaController {
    @Autowired
    private ResenjaService resenjaService;

    @PostMapping(value = "/addText", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addResenjeText(@RequestBody TestDTO testDTO) throws Exception {
        resenjaService.addResenjeFromText(testDTO.getText());
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }

    @PostMapping(value = "/addFile", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addResenjeFile(@RequestBody String path) throws Exception {
        resenjaService.addResenjeFromFile(path);
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }

    @GetMapping(value = "/getDocument/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Document> getResenjeDocument(@PathVariable String id) throws Exception {
        Document document = resenjaService.getResenjeDocument(id);
        if(document == null) {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(document, HttpStatus.OK);
    }
}
