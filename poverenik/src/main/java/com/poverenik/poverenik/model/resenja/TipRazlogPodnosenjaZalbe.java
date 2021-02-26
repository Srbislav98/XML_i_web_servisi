//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.26 at 08:31:12 AM CET 
//


package com.poverenik.poverenik.model.resenja;

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


/**
 * <p>Java class for TipRazlogPodnosenjaZalbe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipRazlogPodnosenjaZalbe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zrtva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datum_zalbe">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}[.]\d{2}[.]\d{4}."/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="optuzeni" type="{http://www.ftn.uns.ac.rs/resenja}TipOptuzeni"/>
 *         &lt;element name="datum_do_kada_mora_da_se_izvrsi" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}[.]\d{2}[.]\d{4}."/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datum_obavestenja" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}[.]\d{2}[.]\d{4}."/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datum_zahteva" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}[.]\d{2}[.]\d{4}."/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipRazlogPodnosenjaZalbe", propOrder = {
    "content"
})
public class TipRazlogPodnosenjaZalbe {

    @XmlElementRefs({
        @XmlElementRef(name = "optuzeni", namespace = "http://www.ftn.uns.ac.rs/resenja", type = JAXBElement.class),
        @XmlElementRef(name = "datum_do_kada_mora_da_se_izvrsi", namespace = "http://www.ftn.uns.ac.rs/resenja", type = JAXBElement.class),
        @XmlElementRef(name = "zrtva", namespace = "http://www.ftn.uns.ac.rs/resenja", type = JAXBElement.class),
        @XmlElementRef(name = "datum_obavestenja", namespace = "http://www.ftn.uns.ac.rs/resenja", type = JAXBElement.class),
        @XmlElementRef(name = "datum_zahteva", namespace = "http://www.ftn.uns.ac.rs/resenja", type = JAXBElement.class),
        @XmlElementRef(name = "datum_zalbe", namespace = "http://www.ftn.uns.ac.rs/resenja", type = JAXBElement.class)
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
     * {@link JAXBElement }{@code <}{@link TipOptuzeni }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
