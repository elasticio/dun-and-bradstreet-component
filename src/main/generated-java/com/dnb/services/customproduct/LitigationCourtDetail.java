
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the information of the legal chambers in which the hearing has taken place or will take place.
 *          
 * 
 * <p>Java class for LitigationCourtDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LitigationCourtDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourtAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectAddress" minOccurs="0"/>
 *         &lt;element name="CourtName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LitigationCourtDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "courtAddress",
    "courtName"
})
public class LitigationCourtDetail {

    @XmlElement(name = "CourtAddress")
    protected SubjectAddress courtAddress;
    @XmlElement(name = "CourtName")
    protected String courtName;

    /**
     * Gets the value of the courtAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddress }
     *     
     */
    public SubjectAddress getCourtAddress() {
        return courtAddress;
    }

    /**
     * Sets the value of the courtAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddress }
     *     
     */
    public void setCourtAddress(SubjectAddress value) {
        this.courtAddress = value;
    }

    /**
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtName(String value) {
        this.courtName = value;
    }

}
