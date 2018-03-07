
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilingInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingOrganizationName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}SearchByFilingNameFilingLocation" minOccurs="0"/>
 *         &lt;element name="FilingDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RequestedPublicFilingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingInquiryDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingOrganizationName",
    "filingLocation",
    "filingDetail"
})
public class FilingInquiryDetail {

    @XmlElement(name = "FilingOrganizationName", required = true)
    protected String filingOrganizationName;
    @XmlElement(name = "FilingLocation")
    protected SearchByFilingNameFilingLocation filingLocation;
    @XmlElement(name = "FilingDetail")
    protected List<RequestedPublicFilingDetail> filingDetail;

    /**
     * Gets the value of the filingOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOrganizationName() {
        return filingOrganizationName;
    }

    /**
     * Sets the value of the filingOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOrganizationName(String value) {
        this.filingOrganizationName = value;
    }

    /**
     * Gets the value of the filingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNameFilingLocation }
     *     
     */
    public SearchByFilingNameFilingLocation getFilingLocation() {
        return filingLocation;
    }

    /**
     * Sets the value of the filingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNameFilingLocation }
     *     
     */
    public void setFilingLocation(SearchByFilingNameFilingLocation value) {
        this.filingLocation = value;
    }

    /**
     * Gets the value of the filingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedPublicFilingDetail }
     * 
     * 
     */
    public List<RequestedPublicFilingDetail> getFilingDetail() {
        if (filingDetail == null) {
            filingDetail = new ArrayList<RequestedPublicFilingDetail>();
        }
        return this.filingDetail;
    }

}
