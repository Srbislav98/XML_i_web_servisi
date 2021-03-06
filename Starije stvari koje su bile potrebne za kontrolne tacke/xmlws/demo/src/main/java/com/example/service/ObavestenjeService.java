package com.example.service;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.example.dto.ObavestenjeDTO;
import com.example.model.Obavestenje;

@Service
public class ObavestenjeService {

	public String jaxBTest(ObavestenjeDTO dto) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Obavestenje.class);
		//unmarshalovanje
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Obavestenje ob = (Obavestenje) unmarshaller.unmarshal(new StringReader(dto.getText()));
		
		System.out.println(ob.toString());
		return dto.getText();
	}

}
