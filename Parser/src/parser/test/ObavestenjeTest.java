package parser.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
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
			try {
				ObjecttoXML(context,obavestenje);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		//System.out.println("Naziv: "+o.getNaziv());
		System.out.println("Adresa podnosioca zahteva: "+o.getAdresaPodnosiocaZahteva());
		System.out.println();
		System.out.println(o.getNaslov());
		System.out.println();
		ispisUvid(o.getUvid());
		System.out.println();
		ispisIznosTroskova(o.getIznosTroskova());
		System.out.println("Dostavljeno: "+o.getDostavljeno());
		
	}



	private void ispisIznosTroskova(TipIznosTroskova iznosTroskova) {
		System.out.println("Iznos troskova kopija: "+iznosTroskova.getKolicinaNovca());	
	}

	private void ispisUvid(TipUvid u) {
		
		System.out.println("Godina trazene informacije: "+u.getGodina());
		System.out.println("Opis trazene informacije: "+u.getOpisTrazeneInformacije());
		System.out.println("Dan uvida: "+u.getImeDana());
		System.out.println("\tOd: "+u.getPocetakAkcije()+""+", Do: "+u.getKrajAkcije()+" časova.");
		System.out.println("Mesto uvida: "+u.getNazivZgrade());
		System.out.println("\tUlica: "+u.getNazivUlice());
		System.out.println("\tBroj zgrade: "+u.getBrojUlice());
		System.out.println("\tBroj kancelarije: "+u.getBrojKancelarije());
		
	}

	private Obavestenje XMLtoObject(JAXBContext context) throws JAXBException {
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Obavestenje obavestenje = (Obavestenje) unmarshaller.unmarshal(new File("./data/obavestenje1cir1.xml"));
	    return obavestenje;
		
	}
	private void ObjecttoXML(JAXBContext context, Obavestenje obavestenje) throws FileNotFoundException, JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(obavestenje, new FileOutputStream(new File("./data/marshal/obavestenje.xml")));
	
	}

}
