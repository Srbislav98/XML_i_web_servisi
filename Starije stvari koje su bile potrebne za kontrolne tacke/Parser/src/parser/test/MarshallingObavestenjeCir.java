package parser.test;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import rs.ac.uns.ftn.obavestenjecir.Obavestenje;

public class MarshallingObavestenjeCir {
	
	public void test() throws Exception{
		try {
			System.out.println("[INFO] Obavestenjecir.\n");
			JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.obavestenjecir");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Obavestenje obavestenje = (Obavestenje)unmarshaller.unmarshal(new File("./data/obavestenjecir.xml"));
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(obavestenje, System.out);
			marshaller.marshal(obavestenje, new FileOutputStream(new File("./data/marshal/obavestenjecir.xml")));
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		MarshallingObavestenjeCir test = new MarshallingObavestenjeCir();
		test.test();
	}

}
