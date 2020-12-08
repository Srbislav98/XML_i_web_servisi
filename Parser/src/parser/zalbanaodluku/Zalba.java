//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.07 at 11:22:46 PM CET 
//


package parser.zalbanaodluku;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresa_primaoca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="podaci_o_zalbi" type="{http://www.ftn.uns.ac.rs/zalbanaodluku}tipPodatakaZalbe"/>
 *         &lt;element name="opis" type="{http://www.ftn.uns.ac.rs/zalbanaodluku}tipOpis"/>
 *         &lt;element name="paragrafi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="paragraf" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="broj" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mesto_i_datum" type="{http://www.ftn.uns.ac.rs/zalbanaodluku}tipMestoDatum"/>
 *         &lt;element name="podaci_o_podnosiocu" type="{http://www.ftn.uns.ac.rs/zalbanaodluku}tipPodatakaPodnosioca"/>
 *         &lt;element name="napomene">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="napomena" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="broj" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "naslov",
    "primaoc",
    "adresaPrimaoca",
    "podaciOZalbi",
    "opis",
    "paragrafi",
    "mestoIDatum",
    "podaciOPodnosiocu",
    "napomene"
})
@XmlRootElement(name = "zalba")
public class Zalba {

    @XmlElement(required = true)
    protected String naslov;
    @XmlElement(required = true)
    protected String primaoc;
    @XmlElement(name = "adresa_primaoca", required = true)
    protected String adresaPrimaoca;
    @XmlElement(name = "podaci_o_zalbi", required = true)
    protected TipPodatakaZalbe podaciOZalbi;
    @XmlElement(required = true)
    protected TipOpis opis;
    @XmlElement(required = true)
    protected Paragrafi paragrafi;
    @XmlElement(name = "mesto_i_datum", required = true)
    protected TipMestoDatum mestoIDatum;
    @XmlElement(name = "podaci_o_podnosiocu", required = true)
    protected TipPodatakaPodnosioca podaciOPodnosiocu;
    @XmlElement(required = true)
    protected Napomene napomene;

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
     * Gets the value of the primaoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaoc() {
        return primaoc;
    }

    /**
     * Sets the value of the primaoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaoc(String value) {
        this.primaoc = value;
    }

    /**
     * Gets the value of the adresaPrimaoca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresaPrimaoca() {
        return adresaPrimaoca;
    }

    /**
     * Sets the value of the adresaPrimaoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresaPrimaoca(String value) {
        this.adresaPrimaoca = value;
    }

    /**
     * Gets the value of the podaciOZalbi property.
     * 
     * @return
     *     possible object is
     *     {@link TipPodatakaZalbe }
     *     
     */
    public TipPodatakaZalbe getPodaciOZalbi() {
        return podaciOZalbi;
    }

    /**
     * Sets the value of the podaciOZalbi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipPodatakaZalbe }
     *     
     */
    public void setPodaciOZalbi(TipPodatakaZalbe value) {
        this.podaciOZalbi = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link TipOpis }
     *     
     */
    public TipOpis getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipOpis }
     *     
     */
    public void setOpis(TipOpis value) {
        this.opis = value;
    }

    /**
     * Gets the value of the paragrafi property.
     * 
     * @return
     *     possible object is
     *     {@link Paragrafi }
     *     
     */
    public Paragrafi getParagrafi() {
        return paragrafi;
    }

    /**
     * Sets the value of the paragrafi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragrafi }
     *     
     */
    public void setParagrafi(Paragrafi value) {
        this.paragrafi = value;
    }

    /**
     * Gets the value of the mestoIDatum property.
     * 
     * @return
     *     possible object is
     *     {@link TipMestoDatum }
     *     
     */
    public TipMestoDatum getMestoIDatum() {
        return mestoIDatum;
    }

    /**
     * Sets the value of the mestoIDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipMestoDatum }
     *     
     */
    public void setMestoIDatum(TipMestoDatum value) {
        this.mestoIDatum = value;
    }

    /**
     * Gets the value of the podaciOPodnosiocu property.
     * 
     * @return
     *     possible object is
     *     {@link TipPodatakaPodnosioca }
     *     
     */
    public TipPodatakaPodnosioca getPodaciOPodnosiocu() {
        return podaciOPodnosiocu;
    }

    /**
     * Sets the value of the podaciOPodnosiocu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipPodatakaPodnosioca }
     *     
     */
    public void setPodaciOPodnosiocu(TipPodatakaPodnosioca value) {
        this.podaciOPodnosiocu = value;
    }

    /**
     * Gets the value of the napomene property.
     * 
     * @return
     *     possible object is
     *     {@link Napomene }
     *     
     */
    public Napomene getNapomene() {
        return napomene;
    }

    /**
     * Sets the value of the napomene property.
     * 
     * @param value
     *     allowed object is
     *     {@link Napomene }
     *     
     */
    public void setNapomene(Napomene value) {
        this.napomene = value;
    }


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
     *         &lt;element name="napomena" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="broj" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "napomena"
    })
    public static class Napomene {

        @XmlElement(required = true)
        protected List<Napomena> napomena;

        /**
         * Gets the value of the napomena property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the napomena property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNapomena().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Napomena }
         * 
         * 
         */
        public List<Napomena> getNapomena() {
            if (napomena == null) {
                napomena = new ArrayList<Napomena>();
            }
            return this.napomena;
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
        public static class Napomena {

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
     *         &lt;element name="paragraf" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="broj" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "paragraf"
    })
    public static class Paragrafi {

        @XmlElement(required = true)
        protected List<Paragraf> paragraf;

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
         * {@link Paragraf }
         * 
         * 
         */
        public List<Paragraf> getParagraf() {
            if (paragraf == null) {
                paragraf = new ArrayList<Paragraf>();
            }
            return this.paragraf;
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

}
