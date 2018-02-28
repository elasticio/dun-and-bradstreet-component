
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResponseDocumentTypeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDocumentTypeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentTypeText" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="FilingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DocumentFormName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "ResponseDocumentTypeDetail", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "documentTypeText",
    "filingDate",
    "documentFormName"
})
public class ResponseDocumentTypeDetail {

    @XmlElement(name = "DocumentTypeText", required = true)
    protected DNBDecodedStringType documentTypeText;
    @XmlElement(name = "FilingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filingDate;
    @XmlElement(name = "DocumentFormName")
    protected String documentFormName;

    /**
     * Gets the value of the documentTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDocumentTypeText() {
        return documentTypeText;
    }

    /**
     * Sets the value of the documentTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDocumentTypeText(DNBDecodedStringType value) {
        this.documentTypeText = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilingDate(XMLGregorianCalendar value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the documentFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentFormName() {
        return documentFormName;
    }

    /**
     * Sets the value of the documentFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentFormName(String value) {
        this.documentFormName = value;
    }

}
