
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityDetailsForCommercialCollectionClaims complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityDetailsForCommercialCollectionClaims">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ActivityTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityDetailsForCommercialCollectionClaims", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "activityDate",
    "activityTypeText"
})
public class ActivityDetailsForCommercialCollectionClaims {

    @XmlElement(name = "ActivityDate")
    protected DNBDateType activityDate;
    @XmlElement(name = "ActivityTypeText")
    protected DNBDecodedStringNewType activityTypeText;

    /**
     * Gets the value of the activityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setActivityDate(DNBDateType value) {
        this.activityDate = value;
    }

    /**
     * Gets the value of the activityTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getActivityTypeText() {
        return activityTypeText;
    }

    /**
     * Sets the value of the activityTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setActivityTypeText(DNBDecodedStringNewType value) {
        this.activityTypeText = value;
    }

}
