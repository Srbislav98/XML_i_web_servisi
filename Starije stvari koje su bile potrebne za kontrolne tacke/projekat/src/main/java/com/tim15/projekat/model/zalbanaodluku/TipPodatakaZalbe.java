//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.24 at 05:15:22 PM CET 
//


package com.tim15.projekat.model.zalbanaodluku;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for tipPodatakaZalbe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipPodatakaZalbe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zalioc" type="{http://www.ftn.uns.ac.rs/zalbanaodluku}tipZalioc"/&gt;
 *         &lt;element name="naziv_organa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="broj" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="godina" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipPodatakaZalbe", propOrder = {
    "content"
})
public class TipPodatakaZalbe {

    @XmlElementRefs({
        @XmlElementRef(name = "naziv_organa", namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", type = JAXBElement.class),
        @XmlElementRef(name = "zalioc", namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", type = JAXBElement.class),
        @XmlElementRef(name = "broj", namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", type = JAXBElement.class),
        @XmlElementRef(name = "godina", namespace = "http://www.ftn.uns.ac.rs/zalbanaodluku", type = JAXBElement.class)
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
     * {@link JAXBElement }{@code <}{@link TipZalioc }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
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