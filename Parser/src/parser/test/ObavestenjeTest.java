package parser.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import parser.obavestenje.Obavestenje;
import parser.obavestenje.TipDostavljeno;
import parser.obavestenje.TipIznosTroskova;
import parser.obavestenje.TipUvid;

public class ObavestenjeTest {

	public static void main(String[] args) {
		ObavestenjeTest test=new ObavestenjeTest();
		test.test();

	}

	private void test() {
		try {
			JAXBContext context = JAXBContext.newInstance("parser.obavestenje");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Obavestenje obavestenje = XMLtoObject(context);
			ispisObavestenje(obavestenje);
			ObjecttoXML(context,obavestenje);
		}catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	private void ispisObavestenje(Obavestenje o) {
		System.out.println("Naziv organa: "+o.getNazivOrgana());
		System.out.println("Sedište organa: "+o.getSedisteOrgana());
		System.out.println("Broj predmeta: "+o.getBrojPredmeta());
		System.out.println("Datum: "+o.getDatum());
		System.out.println();
		System.out.println("Ime: "+o.getIme());
		System.out.println("Prezime: "+o.getPrezime());
		System.out.println("Naziv: "+o.getNaziv());
		System.out.println("Adresa podnosioca zahteva: "+o.getAdresaPodnosiocaZahteva());
		System.out.println();
		System.out.println(o.getNaslov());
		System.out.println();
		ispisUvid(o.getUvid());
		System.out.println();
		ispisIznosTroskova(o.getIznosTroskova());
		System.out.println();
		ispisDostavljeno(o.getDostavljeno());
		
	}

	private void ispisDostavljeno(TipDostavljeno d) {
		
		System.out.println("Dostavljeno: ");
		System.out.println("\tImenovanom "+d.getKojemMPDostavlja());
		System.out.println("\tArhivi "+d.getArhiva());
		
	}

	private void ispisIznosTroskova(TipIznosTroskova iznosTroskova) {
		System.out.println("Iznos troskova kopija: "+iznosTroskova.getContent().indexOf(0));	
	}

	private void ispisUvid(TipUvid u) {
		
		System.out.println("Godina trazene informacije: "+u.getContent().indexOf(0));
		System.out.println("Opis trazene informacije: "+u.getContent().indexOf(4));
		System.out.println("Dan uvida: "+u.getContent().indexOf(5));
		System.out.println("\tOd: "+u.getContent().indexOf(1)+""+", Do: "+u.getContent().indexOf(8)+" časova.");
		System.out.println("Mesto uvida: "+u.getContent().indexOf(3));
		System.out.println("\tUlica: "+u.getContent().indexOf(2));
		System.out.println("\tBroj zgrade: "+u.getContent().indexOf(7));
		System.out.println("\tBroj kancelarije: "+u.getContent().indexOf(9));
		
	}

	private Obavestenje XMLtoObject(JAXBContext context) throws JAXBException {
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Obavestenje obavestenje = (Obavestenje) unmarshaller.unmarshal(new File("./data/obavestenjecir.xml"));
	    return obavestenje;
		
	}
	private void ObjecttoXML(JAXBContext context, Obavestenje obavestenje) {
		
	}

}
