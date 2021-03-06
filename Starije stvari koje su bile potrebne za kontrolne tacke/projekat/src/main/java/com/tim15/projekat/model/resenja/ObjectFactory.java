//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.24 at 05:15:22 PM CET 
//


package com.tim15.projekat.model.resenja;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.resenja package. 
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

    private final static QName _ResenjeLevo_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "levo");
    private final static QName _ResenjeDesno_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "desno");
    private final static QName _ResenjeOpisZalbe_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "opis_zalbe");
    private final static QName _ResenjeNaslov_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "naslov");
    private final static QName _ResenjeResenjeZalbe_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "resenje_zalbe");
    private final static QName _ResenjePodnaslov_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "podnaslov");
    private final static QName _ResenjeObrazlozenjaZalbe_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "obrazlozenja_zalbe");
    private final static QName _ResenjeFusnota_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "fusnota");
    private final static QName _ResenjePoverenik_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "poverenik");
    private final static QName _TipPrekrsajDatumZahteva_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "datum_zahteva");
    private final static QName _TipPoverenikImePoverenika_QNAME = new QName("http://www.ftn.uns.ac.rs/resenja", "ime_poverenika");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.resenja
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Resenje }
     * 
     */
    public Resenje createResenje() {
        return new Resenje();
    }

    /**
     * Create an instance of {@link TipLevo }
     * 
     */
    public TipLevo createTipLevo() {
        return new TipLevo();
    }

    /**
     * Create an instance of {@link TipDesno }
     * 
     */
    public TipDesno createTipDesno() {
        return new TipDesno();
    }

    /**
     * Create an instance of {@link TipOpisZalbe }
     * 
     */
    public TipOpisZalbe createTipOpisZalbe() {
        return new TipOpisZalbe();
    }

    /**
     * Create an instance of {@link TipObrazlozenjaZalbe }
     * 
     */
    public TipObrazlozenjaZalbe createTipObrazlozenjaZalbe() {
        return new TipObrazlozenjaZalbe();
    }

    /**
     * Create an instance of {@link TipPoverenik }
     *
     */
    public TipPoverenik createTipPoverenik() {
        return new TipPoverenik();
    }

    /**
     * Create an instance of {@link TipPrekrsaj }
     *
     */
    public TipPrekrsaj createTipPrekrsaj() {
        return new TipPrekrsaj();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipLevo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "levo", scope = Resenje.class)
    public JAXBElement<TipLevo> createResenjeLevo(TipLevo value) {
        return new JAXBElement<TipLevo>(_ResenjeLevo_QNAME, TipLevo.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipDesno }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "desno", scope = Resenje.class)
    public JAXBElement<TipDesno> createResenjeDesno(TipDesno value) {
        return new JAXBElement<TipDesno>(_ResenjeDesno_QNAME, TipDesno.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipOpisZalbe }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "opis_zalbe", scope = Resenje.class)
    public JAXBElement<TipOpisZalbe> createResenjeOpisZalbe(TipOpisZalbe value) {
        return new JAXBElement<TipOpisZalbe>(_ResenjeOpisZalbe_QNAME, TipOpisZalbe.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "naslov", scope = Resenje.class)
    public JAXBElement<String> createResenjeNaslov(String value) {
        return new JAXBElement<String>(_ResenjeNaslov_QNAME, String.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "resenje_zalbe", scope = Resenje.class)
    public JAXBElement<String> createResenjeResenjeZalbe(String value) {
        return new JAXBElement<String>(_ResenjeResenjeZalbe_QNAME, String.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "podnaslov", scope = Resenje.class)
    public JAXBElement<String> createResenjePodnaslov(String value) {
        return new JAXBElement<String>(_ResenjePodnaslov_QNAME, String.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipObrazlozenjaZalbe }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "obrazlozenja_zalbe", scope = Resenje.class)
    public JAXBElement<TipObrazlozenjaZalbe> createResenjeObrazlozenjaZalbe(TipObrazlozenjaZalbe value) {
        return new JAXBElement<TipObrazlozenjaZalbe>(_ResenjeObrazlozenjaZalbe_QNAME, TipObrazlozenjaZalbe.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "fusnota", scope = Resenje.class)
    public JAXBElement<String> createResenjeFusnota(String value) {
        return new JAXBElement<String>(_ResenjeFusnota_QNAME, String.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipPoverenik }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "poverenik", scope = Resenje.class)
    public JAXBElement<TipPoverenik> createResenjePoverenik(TipPoverenik value) {
        return new JAXBElement<TipPoverenik>(_ResenjePoverenik_QNAME, TipPoverenik.class, Resenje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "datum_zahteva", scope = TipPrekrsaj.class)
    public JAXBElement<String> createTipPrekrsajDatumZahteva(String value) {
        return new JAXBElement<String>(_TipPrekrsajDatumZahteva_QNAME, String.class, TipPrekrsaj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "ime_poverenika", scope = TipPoverenik.class)
    public JAXBElement<String> createTipPoverenikImePoverenika(String value) {
        return new JAXBElement<String>(_TipPoverenikImePoverenika_QNAME, String.class, TipPoverenik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenja", name = "datum_zahteva", scope = TipOpisZalbe.class)
    public JAXBElement<String> createTipOpisZalbeDatumZahteva(String value) {
        return new JAXBElement<String>(_TipPrekrsajDatumZahteva_QNAME, String.class, TipOpisZalbe.class, value);
    }

}
