//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.07 at 06:03:39 PM CET 
//


package rs.ac.uns.ftn.obavestenjecir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="naziv_organa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sediste_organa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="broj_predmeta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresa_podnosioca_zahteva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uvid" type="{http://www.ftn.uns.ac.rs/obavestenjecir}tipUvid"/>
 *         &lt;element name="paragraf" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="broj" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="iznos_troskova" type="{http://www.ftn.uns.ac.rs/obavestenjecir}tipIznosTroskova"/>
 *         &lt;element name="dostavljeno" type="{http://www.ftn.uns.ac.rs/obavestenjecir}tipDostavljeno"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nazivOrgana",
    "sedisteOrgana",
    "brojPredmeta",
    "datum",
    "ime",
    "prezime",
    "naziv",
    "adresaPodnosiocaZahteva",
    "naslov",
    "uvid",
    "paragraf",
    "iznosTroskova",
    "dostavljeno"
})
@XmlRootElement(name = "obavestenje")
public class Obavestenje {

    @XmlElement(name = "naziv_organa", required = true)
    protected String nazivOrgana;
    @XmlElement(name = "sediste_organa", required = true)
    protected String sedisteOrgana;
    @XmlElement(name = "broj_predmeta", required = true, type = Integer.class, nillable = true)
    protected Integer brojPredmeta;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(required = true)
    protected String ime;
    @XmlElement(required = true)
    protected String prezime;
    @XmlElement(required = true)
    protected String naziv;
    @XmlElement(name = "adresa_podnosioca_zahteva", required = true)
    protected String adresaPodnosiocaZahteva;
    @XmlElement(required = true)
    protected String naslov;
    @XmlElement(required = true)
    protected TipUvid uvid;
    @XmlElement(required = true)
    protected List<Obavestenje.Paragraf> paragraf;
    @XmlElement(name = "iznos_troskova", required = true)
    protected TipIznosTroskova iznosTroskova;
    @XmlElement(required = true)
    protected TipDostavljeno dostavljeno;

    /**
     * Gets the value of the nazivOrgana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivOrgana() {
        return nazivOrgana;
    }

    /**
     * Sets the value of the nazivOrgana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivOrgana(String value) {
        this.nazivOrgana = value;
    }

    /**
     * Gets the value of the sedisteOrgana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSedisteOrgana() {
        return sedisteOrgana;
    }

    /**
     * Sets the value of the sedisteOrgana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSedisteOrgana(String value) {
        this.sedisteOrgana = value;
    }

    /**
     * Gets the value of the brojPredmeta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrojPredmeta() {
        return brojPredmeta;
    }

    /**
     * Sets the value of the brojPredmeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrojPredmeta(Integer value) {
        this.brojPredmeta = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
    }

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the adresaPodnosiocaZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresaPodnosiocaZahteva() {
        return adresaPodnosiocaZahteva;
    }

    /**
     * Sets the value of the adresaPodnosiocaZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresaPodnosiocaZahteva(String value) {
        this.adresaPodnosiocaZahteva = value;
    }

    /**
     * Gets the value of the naslov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaslov() {
        return naslov;
    }

    /**
     * Sets the value of the naslov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaslov(String value) {
        this.naslov = value;
    }

    /**
     * Gets the value of the uvid property.
     * 
     * @return
     *     possible object is
     *     {@link TipUvid }
     *     
     */
    public TipUvid getUvid() {
        return uvid;
    }

    /**
     * Sets the value of the uvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipUvid }
     *     
     */
    public void setUvid(TipUvid value) {
        this.uvid = value;
    }

    /**
     * Gets the value of the paragraf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Obavestenje.Paragraf }
     * 
     * 
     */
    public List<Obavestenje.Paragraf> getParagraf() {
        if (paragraf == null) {
            paragraf = new ArrayList<Obavestenje.Paragraf>();
        }
        return this.paragraf;
    }

    /**
     * Gets the value of the iznosTroskova property.
     * 
     * @return
     *     possible object is
     *     {@link TipIznosTroskova }
     *     
     */
    public TipIznosTroskova getIznosTroskova() {
        return iznosTroskova;
    }

    /**
     * Sets the value of the iznosTroskova property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipIznosTroskova }
     *     
     */
    public void setIznosTroskova(TipIznosTroskova value) {
        this.iznosTroskova = value;
    }

    /**
     * Gets the value of the dostavljeno property.
     * 
     * @return
     *     possible object is
     *     {@link TipDostavljeno }
     *     
     */
    public TipDostavljeno getDostavljeno() {
        return dostavljeno;
    }

    /**
     * Sets the value of the dostavljeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipDostavljeno }
     *     
     */
    public void setDostavljeno(TipDostavljeno value) {
        this.dostavljeno = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="broj" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Paragraf {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "broj")
        protected String broj;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the broj property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBroj() {
            return broj;
        }

        /**
         * Sets the value of the broj property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBroj(String value) {
            this.broj = value;
        }

    }

}
