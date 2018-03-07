
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the information about the business meets certification eligibility criteria established by the SBA effective 7/1/99.  All firms must be certified by one of the Small Disadvantaged Business Certification Agencies designated by the SBA. To qualify must be a small business, not exceed standards for Primary SIC, meet Contracting Officers’ assigned SIC code, be a U.S. Citizen and be 51% owned and controlled by one or more Socially and Economically Disadvantaged Individuals.
 *          
 * 
 * <p>Java class for SmallDisadvantagedBusinessDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmallDisadvantagedBusinessDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificationStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CertificationExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DataProviderDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DataProviderDetail" minOccurs="0"/>
 *         &lt;element name="DNBReceivedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmallDisadvantagedBusinessDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "certificationStartDate",
    "certificationExpirationDate",
    "dataProviderDetail",
    "dnbReceivedDate"
})
public class SmallDisadvantagedBusinessDetail {

    @XmlElement(name = "CertificationStartDate")
    protected DNBDateType certificationStartDate;
    @XmlElement(name = "CertificationExpirationDate")
    protected DNBDateType certificationExpirationDate;
    @XmlElement(name = "DataProviderDetail")
    protected DataProviderDetail dataProviderDetail;
    @XmlElement(name = "DNBReceivedDate")
    protected DNBDateType dnbReceivedDate;

    /**
     * Gets the value of the certificationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getCertificationStartDate() {
        return certificationStartDate;
    }

    /**
     * Sets the value of the certificationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setCertificationStartDate(DNBDateType value) {
        this.certificationStartDate = value;
    }

    /**
     * Gets the value of the certificationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getCertificationExpirationDate() {
        return certificationExpirationDate;
    }

    /**
     * Sets the value of the certificationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setCertificationExpirationDate(DNBDateType value) {
        this.certificationExpirationDate = value;
    }

    /**
     * Gets the value of the dataProviderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DataProviderDetail }
     *     
     */
    public DataProviderDetail getDataProviderDetail() {
        return dataProviderDetail;
    }

    /**
     * Sets the value of the dataProviderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProviderDetail }
     *     
     */
    public void setDataProviderDetail(DataProviderDetail value) {
        this.dataProviderDetail = value;
    }

    /**
     * Gets the value of the dnbReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getDNBReceivedDate() {
        return dnbReceivedDate;
    }

    /**
     * Sets the value of the dnbReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setDNBReceivedDate(DNBDateType value) {
        this.dnbReceivedDate = value;
    }

}
