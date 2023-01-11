//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.11 at 06:36:21 PM CET 
//


package org.generator.entities;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Nagłówek JPK_FA
 * 
 * <p>Java class for TNaglowek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TNaglowek"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KodFormularza"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://jpk.mf.gov.pl/wzor/2019/09/27/09271/&gt;TKodFormularza"&gt;
 *                 &lt;attribute name="kodSystemowy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="JPK_FA (3)" /&gt;
 *                 &lt;attribute name="wersjaSchemy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1-0" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WariantFormularza"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CelZlozenia" type="{http://jpk.mf.gov.pl/wzor/2019/09/27/09271/}TCelZlozenia"/&gt;
 *         &lt;element name="DataWytworzeniaJPK" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TDataCzas"/&gt;
 *         &lt;element name="DataOd" type="{http://jpk.mf.gov.pl/wzor/2019/09/27/09271/}TData"/&gt;
 *         &lt;element name="DataDo" type="{http://jpk.mf.gov.pl/wzor/2019/09/27/09271/}TData"/&gt;
 *         &lt;element name="KodUrzedu" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TKodUS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNaglowek", namespace = "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", propOrder = {
    "kodFormularza",
    "wariantFormularza",
    "celZlozenia",
    "dataWytworzeniaJPK",
    "dataOd",
    "dataDo",
    "kodUrzedu"
})
@XmlSeeAlso({
    org.generator.entities.JPK.Naglowek.class
})
public class TNaglowek {

    @XmlElement(name = "KodFormularza", required = true)
    protected TNaglowek.KodFormularza kodFormularza;
    @XmlElement(name = "WariantFormularza")
    protected byte wariantFormularza;
    @XmlElement(name = "CelZlozenia")
    protected byte celZlozenia;
    @XmlElement(name = "DataWytworzeniaJPK", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataWytworzeniaJPK;
    @XmlElement(name = "DataOd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOd;
    @XmlElement(name = "DataDo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDo;
    @XmlElement(name = "KodUrzedu", required = true)
    protected String kodUrzedu;

    /**
     * Gets the value of the kodFormularza property.
     * 
     * @return
     *     possible object is
     *     {@link TNaglowek.KodFormularza }
     *     
     */
    public TNaglowek.KodFormularza getKodFormularza() {
        return kodFormularza;
    }

    /**
     * Sets the value of the kodFormularza property.
     * 
     * @param value
     *     allowed object is
     *     {@link TNaglowek.KodFormularza }
     *     
     */
    public void setKodFormularza(TNaglowek.KodFormularza value) {
        this.kodFormularza = value;
    }

    /**
     * Gets the value of the wariantFormularza property.
     * 
     */
    public byte getWariantFormularza() {
        return wariantFormularza;
    }

    /**
     * Sets the value of the wariantFormularza property.
     * 
     */
    public void setWariantFormularza(byte value) {
        this.wariantFormularza = value;
    }

    /**
     * Gets the value of the celZlozenia property.
     * 
     */
    public byte getCelZlozenia() {
        return celZlozenia;
    }

    /**
     * Sets the value of the celZlozenia property.
     * 
     */
    public void setCelZlozenia(byte value) {
        this.celZlozenia = value;
    }

    /**
     * Gets the value of the dataWytworzeniaJPK property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataWytworzeniaJPK() {
        return dataWytworzeniaJPK;
    }

    /**
     * Sets the value of the dataWytworzeniaJPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataWytworzeniaJPK(XMLGregorianCalendar value) {
        this.dataWytworzeniaJPK = value;
    }

    /**
     * Gets the value of the dataOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOd() {
        return dataOd;
    }

    /**
     * Sets the value of the dataOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOd(XMLGregorianCalendar value) {
        this.dataOd = value;
    }

    /**
     * Gets the value of the dataDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDo() {
        return dataDo;
    }

    /**
     * Sets the value of the dataDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDo(XMLGregorianCalendar value) {
        this.dataDo = value;
    }

    /**
     * Gets the value of the kodUrzedu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodUrzedu() {
        return kodUrzedu;
    }

    /**
     * Sets the value of the kodUrzedu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodUrzedu(String value) {
        this.kodUrzedu = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://jpk.mf.gov.pl/wzor/2019/09/27/09271/&gt;TKodFormularza"&gt;
     *       &lt;attribute name="kodSystemowy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="JPK_FA (3)" /&gt;
     *       &lt;attribute name="wersjaSchemy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1-0" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class KodFormularza {

        @XmlValue
        protected TKodFormularza value;
        @XmlAttribute(name = "kodSystemowy", required = true)
        protected String kodSystemowy;
        @XmlAttribute(name = "wersjaSchemy", required = true)
        protected String wersjaSchemy;

        /**
         * Symbol wzoru formularza
         * 
         * @return
         *     possible object is
         *     {@link TKodFormularza }
         *     
         */
        public TKodFormularza getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link TKodFormularza }
         *     
         */
        public void setValue(TKodFormularza value) {
            this.value = value;
        }

        /**
         * Gets the value of the kodSystemowy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKodSystemowy() {
            if (kodSystemowy == null) {
                return "JPK_FA (3)";
            } else {
                return kodSystemowy;
            }
        }

        /**
         * Sets the value of the kodSystemowy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKodSystemowy(String value) {
            this.kodSystemowy = value;
        }

        /**
         * Gets the value of the wersjaSchemy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWersjaSchemy() {
            if (wersjaSchemy == null) {
                return "1-0";
            } else {
                return wersjaSchemy;
            }
        }

        /**
         * Sets the value of the wersjaSchemy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWersjaSchemy(String value) {
            this.wersjaSchemy = value;
        }

    }

}