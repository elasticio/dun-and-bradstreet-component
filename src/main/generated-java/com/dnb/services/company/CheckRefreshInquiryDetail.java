
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CheckRefreshInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRefreshInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CompanyServiceV2.0}DUNSNumberType"/>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CompanyServiceV2.0}CountryISOAlpha2Type"/>
 *         &lt;element name="RefreshCheckFromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRefreshInquiryDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "dunsNumber",
    "countryISOAlpha2Code",
    "refreshCheckFromDate"
})
public class CheckRefreshInquiryDetail {

    @XmlElement(name = "DUNSNumber", required = true)
    protected String dunsNumber;
    @XmlElement(name = "CountryISOAlpha2Code", required = true)
    protected String countryISOAlpha2Code;
    @XmlElement(name = "RefreshCheckFromDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refreshCheckFromDate;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the countryISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }

    /**
     * Sets the value of the countryISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOAlpha2Code(String value) {
        this.countryISOAlpha2Code = value;
    }

    /**
     * Gets the value of the refreshCheckFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefreshCheckFromDate() {
        return refreshCheckFromDate;
    }

    /**
     * Sets the value of the refreshCheckFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefreshCheckFromDate(XMLGregorianCalendar value) {
        this.refreshCheckFromDate = value;
    }

}
