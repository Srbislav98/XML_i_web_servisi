package parser.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import parser.zalabacutanje.Adresa;
import parser.zalabacutanje.TPodnosilacZalbe;
import parser.zalabacutanje.TPrimalacZalbe;
import parser.zalabacutanje.TSadrzaj;
import parser.zalabacutanje.Zalbacutanje;

public class ZalbacutanjeTest {

	public static void main(String[] args) {
		ZalbacutanjeTest zalbaTest =new ZalbacutanjeTest();
		zalbaTest.test();

	}

	private void test() {
		try {
			JAXBContext context = JAXBContext.newInstance("parser.zalabacutanje");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Zalbacutanje zalba = XMLtoObject(context);
			ispisZalbe(zalba);
			try {
				ObjecttoXML(context,zalba);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	private void ispisZalbe(Zalbacutanje z) {
		System.out.println("Datum: "+z.getDatum());
		System.out.println("Mesto: "+z.getMesto());
		System.out.println("Naslov: "+z.getNaslov());
		System.out.println();
		ispisPrimalacZalbe(z.getPrimalacZalbe());
		System.out.println();
		ispisSadrzaja(z.getSadrzaj());
		System.out.println();
		ispisPodnosilacZalbe(z.getPodnosilacZalbe());
		
	}


	private void ispisPodnosilacZalbe(TPodnosilacZalbe p) {
		System.out.println("Podnosilac žalbe: ");
		System.out.println("\tIme: "+p.getIme());
		System.out.println("\tPrezime: "+p.getPrezime());
		ispisAdrese(p.getAdresa());
		System.out.println("\tDrugi kontakt podaci: "+p.getDrugiKontaktPodaci());
		
	}

	private void ispisSadrzaja(TSadrzaj s) {
		System.out.println("Naziv organa protiv kojeg se podnosi žalba: "+s.getNazivOrgana());
		System.out.println("Razlog žalbe: "+s.getRazlogZalbe());
		System.out.println("Datum zahteva žalbe: "+s.getDatumZahteva());
		System.out.println("Podaci o zahtevu i informacije: "+s.getPodaciOZahtevuIInfo());
		
	}

	private void ispisPrimalacZalbe(TPrimalacZalbe pz) {
		System.out.println("Primalac žalbe: ");
		System.out.println("\tNaziv: "+pz.getNaziv());
		ispisAdrese(pz.getAdresa());
		
	}

	private void ispisAdrese(Adresa a) {
		System.out.println("\tAdresa: ");
		System.out.println("\t\tMesto: "+a.getMesto());
		System.out.println("\t\tUlica: "+a.getUlica());
		System.out.println("\t\tBroj ulice: "+a.getBrUlice());		
	}

	private Zalbacutanje XMLtoObject(JAXBContext context) throws JAXBException {
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Zalbacutanje zalba = (Zalbacutanje) unmarshaller.unmarshal(new File("./data/zalbacutanjecir.xml"));
	    return zalba;
		
	}
	private void ObjecttoXML(JAXBContext context, Zalbacutanje zalba) throws JAXBException, FileNotFoundException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(zalba, new FileOutputStream(new File("./data/marshal/zalbacutanje.xml")));
	}

}

