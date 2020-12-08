package rs.ac.uns.ftn.resenja.test;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import rs.ac.uns.ftn.resenja.Resenje;

public class MarshallingPrvoResenje {
	
	public void test() throws Exception{
		try {
			System.out.println("[INFO] Resenja: JAXB marshalling.\n");
			JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.resenja");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Resenje resenje = (Resenje)unmarshaller.unmarshal(new File("./data/prvoResenje.xml"));
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(resenje, System.out);
			marshaller.marshal(resenje, new FileOutputStream(new File("./data/marshal/resenjePrvo.xml")));
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		MarshallingPrvoResenje test = new MarshallingPrvoResenje();
		test.test();
	}

}
