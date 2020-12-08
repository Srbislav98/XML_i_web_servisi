package parser.test;

import parser.zalbanaodluku.Zalba;
import rs.ac.uns.ftn.obavestenjecir.Obavestenje;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ZalbanaodlukuTest {

    public static void main(String[] args) throws Exception{
        ZalbanaodlukuTest test = new ZalbanaodlukuTest();
        test.test();
    }

    private void test() throws FileNotFoundException {
        try {
            System.out.println("[INFO] Zalbanaodluku.\n");
            JAXBContext context = JAXBContext.newInstance("parser.zalbanaodluku");
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Zalba zalba = (Zalba)unmarshaller.unmarshal(new File("./data/zalbanaodluku.xml"));

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(zalba, System.out);
            marshaller.marshal(zalba, new FileOutputStream(new File("./data/marshal/zalbanaodluku.xml")));
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /*private void test() {
        try {
            JAXBContext context = JAXBContext.newInstance("parser.zalbanaodluku");
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Zalba zalba = XMLtoObject(context);
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

    private void ispisZalbe(Zalba z) {

    }

    private Zalba XMLtoObject(JAXBContext context) throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Zalba zalba = (Zalba) unmarshaller.unmarshal(new File("./data/zalbanaodluku.xml"));
        return zalba;

    }
    private void ObjecttoXML(JAXBContext context, Zalba zalba) throws JAXBException, FileNotFoundException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(zalba, new FileOutputStream(new File("./data/marshal/zalbanaodluku.xml")));
    }*/

}
