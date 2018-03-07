
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the details of the online service, platform, or site that focuses on facilitating the building of social networks or social relations among people in which this principal is a participant.
 *          
 * 
 * <p>Java class for SocialNetworkingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialNetworkingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SocialNetworkingServiceProviderText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialNetworkingDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "userID",
    "socialNetworkingServiceProviderText"
})
public class SocialNetworkingDetail {

    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "SocialNetworkingServiceProviderText", required = true)
    protected DNBDecodedStringType socialNetworkingServiceProviderText;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the socialNetworkingServiceProviderText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSocialNetworkingServiceProviderText() {
        return socialNetworkingServiceProviderText;
    }

    /**
     * Sets the value of the socialNetworkingServiceProviderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSocialNetworkingServiceProviderText(DNBDecodedStringType value) {
        this.socialNetworkingServiceProviderText = value;
    }

}
