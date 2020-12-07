package com.example.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ObavestenjeDTO;
import com.example.service.ObavestenjeService;

@RestController
@RequestMapping(value = "api/xml/obavestenja", produces = MediaType.APPLICATION_JSON_VALUE, consumes =  MediaType.APPLICATION_JSON_VALUE)
public class ObavestenjeController {
	private ObavestenjeService obavestenjeService;
	
	@PostMapping("/izXMLuDTOuXML")
	public ResponseEntity<ObavestenjeDTO> getizXMLuDTO(@RequestBody ObavestenjeDTO dto) throws Exception{
		String response = obavestenjeService.jaxBTest(dto);
		return new ResponseEntity<ObavestenjeDTO>(new ObavestenjeDTO(response), HttpStatus.OK);
	}

}
