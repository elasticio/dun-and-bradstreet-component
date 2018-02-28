
package com.dnb.services.report;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryReportProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryReportProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBProductID" type="{http://services.dnb.com/ReportProductServiceV2.0}ProductCode"/>
 *         &lt;element name="LanguageCode" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="ObjectAttachment" type="{http://services.dnb.com/ReportProductServiceV2.0}ObjectAttachmentForResponse"/>
 *         &lt;element name="ArchiveDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}ResponseArchiveDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryReportProduct", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "dnbProductID",
    "languageCode",
    "objectAttachment",
    "archiveDetail"
})
public class CountryReportProduct {

    @XmlElement(name = "DNBProductID", required = true)
    protected String dnbProductID;
    @XmlElement(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlElement(name = "ObjectAttachment", required = true)
    protected ObjectAttachmentForResponse objectAttachment;
    @XmlElement(name = "ArchiveDetail")
    protected ResponseArchiveDetail archiveDetail;

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
     * Gets the value of the objectAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectAttachmentForResponse }
     *     
     */
    public ObjectAttachmentForResponse getObjectAttachment() {
        return objectAttachment;
    }

    /**
     * Sets the value of the objectAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAttachmentForResponse }
     *     
     */
    public void setObjectAttachment(ObjectAttachmentForResponse value) {
        this.objectAttachment = value;
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

}
