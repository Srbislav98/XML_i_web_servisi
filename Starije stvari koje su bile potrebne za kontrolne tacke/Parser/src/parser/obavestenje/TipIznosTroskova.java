//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.08 at 03:09:37 AM CET 
//


package parser.obavestenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipIznosTroskova complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipIznosTroskova">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kolicina_novca" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipIznosTroskova", propOrder = {
    "kolicinaNovca"
})
public class TipIznosTroskova {

    @XmlElement(name = "kolicina_novca", required = true, type = Integer.class, nillable = true)
    protected Integer kolicinaNovca;

    /**
     * Gets the value of the kolicinaNovca property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKolicinaNovca() {
        return kolicinaNovca;
    }

    /**
     * Sets the value of the kolicinaNovca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKolicinaNovca(Integer value) {
        this.kolicinaNovca = value;
    }

}
