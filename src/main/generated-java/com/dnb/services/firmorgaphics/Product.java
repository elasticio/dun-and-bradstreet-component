
package com.dnb.services.firmorgaphics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBProductID" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ProductCode" minOccurs="0"/>
 *         &lt;element name="InDateStatusText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SubjectScopeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}Organization"/>
 *         &lt;element name="ArchiveDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ResponseArchiveDetail" minOccurs="0"/>
 *         &lt;element name="CopyrightNoticeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "dnbProductID",
    "inDateStatusText",
    "subjectScopeText",
    "languageCode",
    "organization",
    "archiveDetail",
    "copyrightNoticeText"
})
public class Product {

    @XmlElement(name = "DNBProductID")
    protected String dnbProductID;
    @XmlElement(name = "InDateStatusText")
    protected DNBDecodedStringType inDateStatusText;
    @XmlElement(name = "SubjectScopeText")
    protected List<DNBDecodedStringType> subjectScopeText;
    @XmlElement(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlElement(name = "Organization", required = true)
    protected Organization organization;
    @XmlElement(name = "ArchiveDetail")
    protected ResponseArchiveDetail archiveDetail;
    @XmlElement(name = "CopyrightNoticeText")
    protected String copyrightNoticeText;

    /**
     * Gets the value of the dnbProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBProductID() {
        return dnbProductID;
    }

    /**
     * Sets the value of the dnbProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBProductID(String value) {
        this.dnbProductID = value;
    }

    /**
     * Gets the value of the inDateStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getInDateStatusText() {
        return inDateStatusText;
    }

    /**
     * Sets the value of the inDateStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setInDateStatusText(DNBDecodedStringType value) {
        this.inDateStatusText = value;
    }

    /**
     * Gets the value of the subjectScopeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectScopeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectScopeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getSubjectScopeText() {
        if (subjectScopeText == null) {
            subjectScopeText = new ArrayList<DNBDecodedStringType>();
        }
        return this.subjectScopeText;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguageCode(BigInteger value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the archiveDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseArchiveDetail }
     *     
     */
    public ResponseArchiveDetail getArchiveDetail() {
        return archiveDetail;
    }

    /**
     * Sets the value of the archiveDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseArchiveDetail }
     *     
     */
    public void setArchiveDetail(ResponseArchiveDetail value) {
        this.archiveDetail = value;
    }

    /**
     * Gets the value of the copyrightNoticeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightNoticeText() {
        return copyrightNoticeText;
    }

    /**
     * Sets the value of the copyrightNoticeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightNoticeText(String value) {
        this.copyrightNoticeText = value;
    }

}
