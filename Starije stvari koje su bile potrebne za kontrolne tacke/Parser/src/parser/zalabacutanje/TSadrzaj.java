//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.08 at 01:59:38 AM CET 
//


package parser.zalabacutanje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TSadrzaj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSadrzaj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="naziv_organa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="razlog_zalbe">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="nije postupio"/>
 *               &lt;enumeration value="nije postupio u celosti"/>
 *               &lt;enumeration value="u zakonskom roku"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datum_zahteva" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="podaci_o_zahtevu_i_info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSadrzaj", propOrder = {
    "nazivOrgana",
    "razlogZalbe",
    "datumZahteva",
    "podaciOZahtevuIInfo"
})
public class TSadrzaj {

    @XmlElement(name = "naziv_organa", required = true)
    protected String nazivOrgana;
    @XmlElement(name = "razlog_zalbe", required = true)
    protected String razlogZalbe;
    @XmlElement(name = "datum_zahteva", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZahteva;
    @XmlElement(name = "podaci_o_zahtevu_i_info", required = true)
    protected String podaciOZahtevuIInfo;

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
     * Gets the value of the razlogZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazlogZalbe() {
        return razlogZalbe;
    }

    /**
     * Sets the value of the razlogZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazlogZalbe(String value) {
        this.razlogZalbe = value;
    }

    /**
     * Gets the value of the datumZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZahteva() {
        return datumZahteva;
    }

    /**
     * Sets the value of the datumZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZahteva(XMLGregorianCalendar value) {
        this.datumZahteva = value;
    }

    /**
     * Gets the value of the podaciOZahtevuIInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodaciOZahtevuIInfo() {
        return podaciOZahtevuIInfo;
    }

    /**
     * Sets the value of the podaciOZahtevuIInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodaciOZahtevuIInfo(String value) {
        this.podaciOZahtevuIInfo = value;
    }

}
