package parser.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import parser.obavestenje.Obavestenje;

public class ObavestenjeTest {

	public static void main(String[] args) {
		ObavestenjeTest test=new ObavestenjeTest();
		test.test();

	}

	private void test() {
		try {
			System.out.println("Parsiranje dokumenta:");
			JAXBContext context = JAXBContext.newInstance("parser.obavestenje");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Obavestenje obavestenje = (Obavestenje) unmarshaller.unmarshal(new File("./data/obavestenjecir.xml"));
			System.out.println(obavestenje.getNaslov());
		}catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}

}
