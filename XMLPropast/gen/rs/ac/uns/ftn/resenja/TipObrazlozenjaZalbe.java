//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.07 at 08:20:29 PM CET 
//


package rs.ac.uns.ftn.resenja;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipObrazlozenja_zalbe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipObrazlozenja_zalbe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="razlog_podnosenja_zalbe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trazenje_odgovora_od_strane_optuzenog" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="odluka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dogadjaj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="odgovor_na_dogadjaj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prekrsaj" type="{http://www.ftn.uns.ac.rs/resenja}TipPrekrsaj" minOccurs="0"/>
 *         &lt;element name="sta_optuzeni_mora_da_uradi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upustvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipObrazlozenja_zalbe", propOrder = {
    "razlogPodnosenjaZalbe",
    "trazenjeOdgovoraOdStraneOptuzenog",
    "odluka",
    "dogadjaj",
    "odgovorNaDogadjaj",
    "prekrsaj",
    "staOptuzeniMoraDaUradi",
    "upustvo"
})
public class TipObrazlozenjaZalbe {

    @XmlElement(name = "razlog_podnosenja_zalbe", required = true)
    protected String razlogPodnosenjaZalbe;
    @XmlElement(name = "trazenje_odgovora_od_strane_optuzenog", required = true)
    protected String trazenjeOdgovoraOdStraneOptuzenog;
    @XmlElement(required = true)
    protected String odluka;
    @XmlElement(required = true)
    protected String dogadjaj;
    @XmlElement(name = "odgovor_na_dogadjaj", required = true)
    protected String odgovorNaDogadjaj;
    protected TipPrekrsaj prekrsaj;
    @XmlElement(name = "sta_optuzeni_mora_da_uradi")
    protected String staOptuzeniMoraDaUradi;
    protected String upustvo;

    /**
     * Gets the value of the razlogPodnosenjaZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazlogPodnosenjaZalbe() {
        return razlogPodnosenjaZalbe;
    }

    /**
     * Sets the value of the razlogPodnosenjaZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazlogPodnosenjaZalbe(String value) {
        this.razlogPodnosenjaZalbe = value;
    }

    /**
     * Gets the value of the trazenjeOdgovoraOdStraneOptuzenog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrazenjeOdgovoraOdStraneOptuzenog() {
        return trazenjeOdgovoraOdStraneOptuzenog;
    }

    /**
     * Sets the value of the trazenjeOdgovoraOdStraneOptuzenog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrazenjeOdgovoraOdStraneOptuzenog(String value) {
        this.trazenjeOdgovoraOdStraneOptuzenog = value;
    }

    /**
     * Gets the value of the odluka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdluka() {
        return odluka;
    }

    /**
     * Sets the value of the odluka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdluka(String value) {
        this.odluka = value;
    }

    /**
     * Gets the value of the dogadjaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogadjaj() {
        return dogadjaj;
    }

    /**
     * Sets the value of the dogadjaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogadjaj(String value) {
        this.dogadjaj = value;
    }

    /**
     * Gets the value of the odgovorNaDogadjaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdgovorNaDogadjaj() {
        return odgovorNaDogadjaj;
    }

    /**
     * Sets the value of the odgovorNaDogadjaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdgovorNaDogadjaj(String value) {
        this.odgovorNaDogadjaj = value;
    }

    /**
     * Gets the value of the prekrsaj property.
     * 
     * @return
     *     possible object is
     *     {@link TipPrekrsaj }
     *     
     */
    public TipPrekrsaj getPrekrsaj() {
        return prekrsaj;
    }

    /**
     * Sets the value of the prekrsaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipPrekrsaj }
     *     
     */
    public void setPrekrsaj(TipPrekrsaj value) {
        this.prekrsaj = value;
    }

    /**
     * Gets the value of the staOptuzeniMoraDaUradi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaOptuzeniMoraDaUradi() {
        return staOptuzeniMoraDaUradi;
    }

    /**
     * Sets the value of the staOptuzeniMoraDaUradi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaOptuzeniMoraDaUradi(String value) {
        this.staOptuzeniMoraDaUradi = value;
    }

    /**
     * Gets the value of the upustvo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpustvo() {
        return upustvo;
    }

    /**
     * Sets the value of the upustvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpustvo(String value) {
        this.upustvo = value;
    }

}
