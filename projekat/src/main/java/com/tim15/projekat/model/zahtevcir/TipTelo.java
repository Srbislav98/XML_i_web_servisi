//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.24 at 05:15:22 PM CET 
//


package com.tim15.projekat.model.zahtevcir;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for tipTelo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipTelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uvod" type="{http://www.ftn.uns.ac.rs/zahtevcir}tipUvod"/&gt;
 *         &lt;element name="levo" type="{http://www.ftn.uns.ac.rs/zahtevcir}tipLevo"/&gt;
 *         &lt;element name="desno" type="{http://www.ftn.uns.ac.rs/zahtevcir}tipDesno"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipTelo", propOrder = {
    "content"
})
public class TipTelo {

    @XmlElementRefs({
        @XmlElementRef(name = "desno", namespace = "http://www.ftn.uns.ac.rs/zahtevcir", type = JAXBElement.class),
        @XmlElementRef(name = "uvod", namespace = "http://www.ftn.uns.ac.rs/zahtevcir", type = JAXBElement.class),
        @XmlElementRef(name = "levo", namespace = "http://www.ftn.uns.ac.rs/zahtevcir", type = JAXBElement.class)
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
     * {@link String }
     * {@link JAXBElement }{@code <}{@link TipDesno }{@code >}
     * {@link JAXBElement }{@code <}{@link TipUvod }{@code >}
     * {@link JAXBElement }{@code <}{@link TipLevo }{@code >}
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
