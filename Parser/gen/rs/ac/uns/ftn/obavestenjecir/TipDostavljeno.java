//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.07 at 11:22:44 PM CET 
//


package rs.ac.uns.ftn.obavestenjecir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipDostavljeno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipDostavljeno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kojem_M._P._dostavlja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arhiva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipDostavljeno", propOrder = {
    "kojemMPDostavlja",
    "arhiva"
})
public class TipDostavljeno {

    @XmlElement(name = "kojem_M._P._dostavlja", required = true)
    protected String kojemMPDostavlja;
    @XmlElement(required = true)
    protected String arhiva;

    /**
     * Gets the value of the kojemMPDostavlja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKojemMPDostavlja() {
        return kojemMPDostavlja;
    }

    /**
     * Sets the value of the kojemMPDostavlja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKojemMPDostavlja(String value) {
        this.kojemMPDostavlja = value;
    }

    /**
     * Gets the value of the arhiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArhiva() {
        return arhiva;
    }

    /**
     * Sets the value of the arhiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArhiva(String value) {
        this.arhiva = value;
    }

}
