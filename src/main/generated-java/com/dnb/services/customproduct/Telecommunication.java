
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records information about the different modes of Telecommunication addresses used by a subject for external contact purposes. The modes of communication include telephone, fax, e-mail, web address.
 *          
 * 
 * <p>Java class for Telecommunication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telecommunication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}TelecommunicationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FacsimileNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}TelecommunicationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}EmailAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SocialMediaDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SocialMediaDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telecommunication", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "telephoneNumber",
    "facsimileNumber",
    "emailAddress",
    "webPageAddress",
    "socialMediaDetail"
})
public class Telecommunication {

    @XmlElement(name = "TelephoneNumber")
    protected List<TelecommunicationNumberType> telephoneNumber;
    @XmlElement(name = "FacsimileNumber")
    protected List<TelecommunicationNumberType> facsimileNumber;
    @XmlElement(name = "EmailAddress")
    protected List<EmailAddressType> emailAddress;
    @XmlElement(name = "WebPageAddress")
    protected List<WebPageAddressType> webPageAddress;
    @XmlElement(name = "SocialMediaDetail")
    protected List<SocialMediaDetail> socialMediaDetail;

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecommunicationNumberType }
     * 
     * 
     */
    public List<TelecommunicationNumberType> getTelephoneNumber() {
        if (telephoneNumber == null) {
            telephoneNumber = new ArrayList<TelecommunicationNumberType>();
        }
        return this.telephoneNumber;
    }

    /**
     * Gets the value of the facsimileNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimileNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimileNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecommunicationNumberType }
     * 
     * 
     */
    public List<TelecommunicationNumberType> getFacsimileNumber() {
        if (facsimileNumber == null) {
            facsimileNumber = new ArrayList<TelecommunicationNumberType>();
        }
        return this.facsimileNumber;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddressType }
     * 
     * 
     */
    public List<EmailAddressType> getEmailAddress() {
        if (emailAddress == null) {
            emailAddress = new ArrayList<EmailAddressType>();
        }
        return this.emailAddress;
    }

    /**
     * Gets the value of the webPageAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webPageAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebPageAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebPageAddressType }
     * 
     * 
     */
    public List<WebPageAddressType> getWebPageAddress() {
        if (webPageAddress == null) {
            webPageAddress = new ArrayList<WebPageAddressType>();
        }
        return this.webPageAddress;
    }

    /**
     * Gets the value of the socialMediaDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialMediaDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialMediaDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialMediaDetail }
     * 
     * 
     */
    public List<SocialMediaDetail> getSocialMediaDetail() {
        if (socialMediaDetail == null) {
            socialMediaDetail = new ArrayList<SocialMediaDetail>();
        }
        return this.socialMediaDetail;
    }

}
