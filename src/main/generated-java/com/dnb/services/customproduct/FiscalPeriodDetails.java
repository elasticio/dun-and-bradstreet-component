
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FiscalPeriodDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiscalPeriodDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FiscalPeriodEndMonth">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FiscalPeriodEndDay" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FiscalPeriodReportDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="FiscalPeriodEndYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiscalPeriodDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "fiscalPeriodEndMonth",
    "fiscalPeriodEndDay",
    "fiscalPeriodReportDate",
    "fiscalPeriodEndYear"
})
public class FiscalPeriodDetails {

    @XmlElement(name = "FiscalPeriodEndMonth")
    protected int fiscalPeriodEndMonth;
    @XmlElement(name = "FiscalPeriodEndDay")
    protected Integer fiscalPeriodEndDay;
    @XmlElement(name = "FiscalPeriodReportDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalPeriodReportDate;
    @XmlElement(name = "FiscalPeriodEndYear")
    protected String fiscalPeriodEndYear;

    /**
     * Gets the value of the fiscalPeriodEndMonth property.
     * 
     */
    public int getFiscalPeriodEndMonth() {
        return fiscalPeriodEndMonth;
    }

    /**
     * Sets the value of the fiscalPeriodEndMonth property.
     * 
     */
    public void setFiscalPeriodEndMonth(int value) {
        this.fiscalPeriodEndMonth = value;
    }

    /**
     * Gets the value of the fiscalPeriodEndDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFiscalPeriodEndDay() {
        return fiscalPeriodEndDay;
    }

    /**
     * Sets the value of the fiscalPeriodEndDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFiscalPeriodEndDay(Integer value) {
        this.fiscalPeriodEndDay = value;
    }

    /**
     * Gets the value of the fiscalPeriodReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalPeriodReportDate() {
        return fiscalPeriodReportDate;
    }

    /**
     * Sets the value of the fiscalPeriodReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalPeriodReportDate(XMLGregorianCalendar value) {
        this.fiscalPeriodReportDate = value;
    }

    /**
     * Gets the value of the fiscalPeriodEndYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalPeriodEndYear() {
        return fiscalPeriodEndYear;
    }

    /**
     * Sets the value of the fiscalPeriodEndYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalPeriodEndYear(String value) {
        this.fiscalPeriodEndYear = value;
    }

}
