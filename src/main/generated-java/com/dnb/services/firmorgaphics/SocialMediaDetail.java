
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the details of the interactive platforms via which subject creates and shares user-generated content; e.g., Internet forums, weblogs, social blogs, wikis, social networks.
 *          
 * 
 * <p>Java class for SocialMediaDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialMediaDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialMediaPlatformName" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="WebPageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialMediaDetail", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "socialMediaPlatformName",
    "webPageURL"
})
public class SocialMediaDetail {

    @XmlElement(name = "SocialMediaPlatformName", required = true)
    protected DNBDecodedStringType socialMediaPlatformName;
    @XmlElement(name = "WebPageURL")
    protected String webPageURL;

    /**
     * Gets the value of the socialMediaPlatformName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSocialMediaPlatformName() {
        return socialMediaPlatformName;
    }

    /**
     * Sets the value of the socialMediaPlatformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSocialMediaPlatformName(DNBDecodedStringType value) {
        this.socialMediaPlatformName = value;
    }

    /**
     * Gets the value of the webPageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPageURL() {
        return webPageURL;
    }

    /**
     * Sets the value of the webPageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPageURL(String value) {
        this.webPageURL = value;
    }

}
