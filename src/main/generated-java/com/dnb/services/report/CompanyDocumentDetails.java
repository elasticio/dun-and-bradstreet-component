
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyDocumentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyDocumentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentTypeDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}ResponseDocumentTypeDetail" minOccurs="0"/>
 *         &lt;element name="DocumentPackageName" minOccurs="0">
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
@XmlType(name = "CompanyDocumentDetails", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "documentTypeDetail",
    "documentPackageName"
})
public class CompanyDocumentDetails {

    @XmlElement(name = "DocumentTypeDetail")
    protected ResponseDocumentTypeDetail documentTypeDetail;
    @XmlElement(name = "DocumentPackageName")
    protected String documentPackageName;

    /**
     * Gets the value of the documentTypeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseDocumentTypeDetail }
     *     
     */
    public ResponseDocumentTypeDetail getDocumentTypeDetail() {
        return documentTypeDetail;
    }

    /**
     * Sets the value of the documentTypeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDocumentTypeDetail }
     *     
     */
    public void setDocumentTypeDetail(ResponseDocumentTypeDetail value) {
        this.documentTypeDetail = value;
    }

    /**
     * Gets the value of the documentPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentPackageName() {
        return documentPackageName;
    }

    /**
     * Sets the value of the documentPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentPackageName(String value) {
        this.documentPackageName = value;
    }

}
