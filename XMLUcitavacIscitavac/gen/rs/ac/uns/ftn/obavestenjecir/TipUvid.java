//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.07 at 06:03:39 PM CET 
//


package rs.ac.uns.ftn.obavestenjecir;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipUvid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipUvid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="godina" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="opis_trazene_informacije" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ime_dana">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Ponedeljak"/>
 *               &lt;enumeration value="Utorak"/>
 *               &lt;enumeration value="Sreda"/>
 *               &lt;enumeration value="\u010cetvrtak"/>
 *               &lt;enumeration value="Petak"/>
 *               &lt;enumeration value="Subota"/>
 *               &lt;enumeration value="Nedelja"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="broj_sati">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="8"/>
 *               &lt;maxInclusive value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pocetak_akcije">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}time">
 *               &lt;minInclusive value="08:00:00"/>
 *               &lt;maxInclusive value="20:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kraj_akcije">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}time">
 *               &lt;minInclusive value="09:00:00"/>
 *               &lt;maxInclusive value="21:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="naziv_zgrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="naziv_ulice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="broj_ulice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="broj_kancelarije" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipUvid", propOrder = {
    "content"
})
public class TipUvid {

    @XmlElementRefs({
        @XmlElementRef(name = "broj_sati", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "godina", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "ime_dana", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "pocetak_akcije", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "naziv_ulice", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "broj_ulice", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "opis_trazene_informacije", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "kraj_akcije", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "broj_kancelarije", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class),
        @XmlElementRef(name = "naziv_zgrade", namespace = "http://www.ftn.uns.ac.rs/obavestenjecir", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
