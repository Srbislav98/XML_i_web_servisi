package rs.ac.uns.ftn.zahtevcirMarshalling;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import rs.ac.uns.ftn.resenja.test.MarshallingPrvoResenje;
import rs.ac.uns.ftn.zahtevcir.Zahtev;

public class MarshallingZahtevcir {
	public void test() throws Exception{
		try {
			System.out.println("[INFO] Resenja: JAXB marshalling.\n");
			JAXBContext context = JAXBContext.newInstance("rs.ac.uns.ftn.zahtevcir");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Zahtev resenje = (Zahtev)unmarshaller.unmarshal(new File("./data/zahtevcir.xml"));
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(resenje, System.out);
			marshaller.marshal(resenje, new FileOutputStream(new File("./data/marshal/zahtevcir.xml")));
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		MarshallingZahtevcir test = new MarshallingZahtevcir();
		test.test();
	}
}
