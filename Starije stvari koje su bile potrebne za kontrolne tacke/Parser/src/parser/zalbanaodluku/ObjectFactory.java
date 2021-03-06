//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.07 at 11:22:46 PM CET 
//


package parser.zalbanaodluku;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.zalbanaodluku package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TipOpisDatum_QNAME = new QName("http://www.ftn.uns.ac.rs/zalbanaodluku", "datum");
    private final static QName _TipOpisUnos_QNAME = new QName("http://www.ftn.uns.ac.rs/zalbanaodluku", "unos");
    private final static QName _TipPodatakaZalbeBroj_QNAME = new QName("http://www.ftn.uns.ac.rs/zalbanaodluku", "broj");
    private final static QName _TipPodatakaZalbeNazivOrgana_QNAME = new QName("http://www.ftn.uns.ac.rs/zalbanaodluku", "naziv_organa");
    private final static QName _TipPodatakaZalbeZalioc_QNAME = new QName("http://www.ftn.uns.ac.rs/zalbanaodluku", "zalioc");
    private final static QName _TipPodatakaZalbeGodina_QNAME = new QName("http://www.ftn.uns.ac.rs/zalbanaodluku", "godina");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.zalbanaodluku
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Zalba }
     * 
     */
    public Zalba createZalba() {
        return new Zalba();
    }

    /**
     * Create an instance of {@link Zalba.Napomene }
     * 
     */
    public Zalba.Napomene createZalbaNapomene() {
        return new Zalba.Napomene();
    }

    /**
     * Create an instance of {@link Zalba.Paragrafi }
     * 
     */
    public Zalba.Paragrafi createZalbaParagrafi() {
        return new Zalba.Paragrafi();
    }

    /**
     * Create an instance of {@link TipPodatakaZalbe }
     * 
     */
    public TipPodatakaZalbe createTipPodatakaZalbe() {
        return new TipPodatakaZalbe();
    }

    /**
     * Create an instance of {@link TipOpis }
     * 
     */
    public TipOpis createTipOpis() {
        return new TipOpis();
    }

    /**
     * Create an instance of {@link TipMestoDatum }
     * 
     */
    public TipMestoDatum createTipMestoDatum() {
        return new TipMestoDatum();
    }

    /**
     * Create an instance of {@link TipPodatakaPodnosioca }
     * 
     */
    public TipPodatakaPodnosioca createTipPodatakaPodnosioca() {
        return new TipPodatakaPodnosioca();
    }

    /**
     * Create an instance of {@link TipZalioc }
     * 
     */
    public TipZalioc createTipZalioc() {
        return new TipZalioc();
    }

    /**
     * Create an instance of {@link Zalba.Napomene.Napomena }
     * 
     */
    public Zalba.Napomene.Napomena createZalbaNapomeneNapomena() {
        return new Zalba.Napomene.Napomena();
    }

    /**
     * Create an instance of {@link Zalba.Paragrafi.Paragraf }
     * 
     */
    public Zalba.Paragrafi.Paragraf createZalbaParagrafiParagraf() {
        return new Zalba.Paragrafi.Paragraf();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", name = "datum", scope = TipOpis.class)
    public JAXBElement<XMLGregorianCalendar> createTipOpisDatum(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TipOpisDatum_QNAME, XMLGregorianCalendar.class, TipOpis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", name = "unos", scope = TipOpis.class)
    public JAXBElement<String> createTipOpisUnos(String value) {
        return new JAXBElement<String>(_TipOpisUnos_QNAME, String.class, TipOpis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", name = "broj", scope = TipPodatakaZalbe.class)
    public JAXBElement<Integer> createTipPodatakaZalbeBroj(Integer value) {
        return new JAXBElement<Integer>(_TipPodatakaZalbeBroj_QNAME, Integer.class, TipPodatakaZalbe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", name = "naziv_organa", scope = TipPodatakaZalbe.class)
    public JAXBElement<String> createTipPodatakaZalbeNazivOrgana(String value) {
        return new JAXBElement<String>(_TipPodatakaZalbeNazivOrgana_QNAME, String.class, TipPodatakaZalbe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipZalioc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", name = "zalioc", scope = TipPodatakaZalbe.class)
    public JAXBElement<TipZalioc> createTipPodatakaZalbeZalioc(TipZalioc value) {
        return new JAXBElement<TipZalioc>(_TipPodatakaZalbeZalioc_QNAME, TipZalioc.class, TipPodatakaZalbe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", name = "godina", scope = TipPodatakaZalbe.class)
    public JAXBElement<XMLGregorianCalendar> createTipPodatakaZalbeGodina(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TipPodatakaZalbeGodina_QNAME, XMLGregorianCalendar.class, TipPodatakaZalbe.class, value);
    }

}
