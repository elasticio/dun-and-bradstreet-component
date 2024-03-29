
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * An entry loop which can repeat multiple times to allow recording of details of public filings. This may include FilingType, FilingLocation.
 *          
 * 
 * <p>Java class for RequestedPublicFilingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedPublicFilingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType"/>
 *         &lt;element name="FilingRolePlayerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FilingToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FilingStatusCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedPublicFilingDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingTypeCode",
    "filingRolePlayerTypeCode",
    "filingFromDate",
    "filingToDate",
    "filingStatusCode"
})
public class RequestedPublicFilingDetail {

    @XmlElement(name = "FilingTypeCode", required = true)
    protected BigInteger filingTypeCode;
    @XmlElement(name = "FilingRolePlayerTypeCode")
    protected List<String> filingRolePlayerTypeCode;
    @XmlElement(name = "FilingFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filingFromDate;
    @XmlElement(name = "FilingToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filingToDate;
    @XmlElement(name = "FilingStatusCode")
    protected BigInteger filingStatusCode;

    /**
     * Gets the value of the filingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilingTypeCode() {
        return filingTypeCode;
    }

    /**
     * Sets the value of the filingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilingTypeCode(BigInteger value) {
        this.filingTypeCode = value;
    }

    /**
     * Gets the value of the filingRolePlayerTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingRolePlayerTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingRolePlayerTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilingRolePlayerTypeCode() {
        if (filingRolePlayerTypeCode == null) {
            filingRolePlayerTypeCode = new ArrayList<String>();
        }
        return this.filingRolePlayerTypeCode;
    }

    /**
     * Gets the value of the filingFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilingFromDate() {
        return filingFromDate;
    }

    /**
     * Sets the value of the filingFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilingFromDate(XMLGregorianCalendar value) {
        this.filingFromDate = value;
    }

    /**
     * Gets the value of the filingToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilingToDate() {
        return filingToDate;
    }

    /**
     * Sets the value of the filingToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilingToDate(XMLGregorianCalendar value) {
        this.filingToDate = value;
    }

    /**
     * Gets the value of the filingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilingStatusCode() {
        return filingStatusCode;
    }

    /**
     * Sets the value of the filingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilingStatusCode(BigInteger value) {
        this.filingStatusCode = value;
    }

}
