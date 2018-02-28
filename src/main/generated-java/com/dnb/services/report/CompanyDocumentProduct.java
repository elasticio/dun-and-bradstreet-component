
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyDocumentProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyDocumentProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization" type="{http://services.dnb.com/ReportProductServiceV2.0}Organization"/>
 *         &lt;element name="DocumentDetails" type="{http://services.dnb.com/ReportProductServiceV2.0}CompanyDocumentDetails"/>
 *         &lt;element name="DocumentHyperLinkAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectAttachment" type="{http://services.dnb.com/ReportProductServiceV2.0}ObjectAttachmentForResponse" minOccurs="0"/>
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
@XmlType(name = "CompanyDocumentProduct", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "organization",
    "documentDetails",
    "documentHyperLinkAddress",
    "objectAttachment",
    "archiveDetail"
})
public class CompanyDocumentProduct {

    @XmlElement(name = "Organization", required = true)
    protected Organization organization;
    @XmlElement(name = "DocumentDetails", required = true)
    protected CompanyDocumentDetails documentDetails;
    @XmlElement(name = "DocumentHyperLinkAddress")
    protected String documentHyperLinkAddress;
    @XmlElement(name = "ObjectAttachment")
    protected ObjectAttachmentForResponse objectAttachment;
    @XmlElement(name = "ArchiveDetail")
    protected ResponseArchiveDetail archiveDetail;

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
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDocumentDetails }
     *     
     */
    public CompanyDocumentDetails getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDocumentDetails }
     *     
     */
    public void setDocumentDetails(CompanyDocumentDetails value) {
        this.documentDetails = value;
    }

    /**
     * Gets the value of the documentHyperLinkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentHyperLinkAddress() {
        return documentHyperLinkAddress;
    }

    /**
     * Sets the value of the documentHyperLinkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentHyperLinkAddress(String value) {
        this.documentHyperLinkAddress = value;
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
