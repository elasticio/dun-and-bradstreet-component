
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditBureauSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditBureauSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditBureauName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubscriberNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubscriberPasswordText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PermissiblePurposeValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EndUserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryCreditBureauToContactIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditBureauSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "creditBureauName",
    "subscriberNumber",
    "subscriberPasswordText",
    "permissiblePurposeValue",
    "endUserName",
    "primaryCreditBureauToContactIndicator"
})
public class CreditBureauSpecification {

    @XmlElement(name = "CreditBureauName", required = true)
    protected String creditBureauName;
    @XmlElement(name = "SubscriberNumber", required = true)
    protected String subscriberNumber;
    @XmlElement(name = "SubscriberPasswordText")
    protected String subscriberPasswordText;
    @XmlElement(name = "PermissiblePurposeValue", required = true)
    protected String permissiblePurposeValue;
    @XmlElement(name = "EndUserName")
    protected String endUserName;
    @XmlElement(name = "PrimaryCreditBureauToContactIndicator")
    protected boolean primaryCreditBureauToContactIndicator;

    /**
     * Gets the value of the creditBureauName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditBureauName() {
        return creditBureauName;
    }

    /**
     * Sets the value of the creditBureauName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditBureauName(String value) {
        this.creditBureauName = value;
    }

    /**
     * Gets the value of the subscriberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    /**
     * Sets the value of the subscriberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNumber(String value) {
        this.subscriberNumber = value;
    }

    /**
     * Gets the value of the subscriberPasswordText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberPasswordText() {
        return subscriberPasswordText;
    }

    /**
     * Sets the value of the subscriberPasswordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberPasswordText(String value) {
        this.subscriberPasswordText = value;
    }

    /**
     * Gets the value of the permissiblePurposeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissiblePurposeValue() {
        return permissiblePurposeValue;
    }

    /**
     * Sets the value of the permissiblePurposeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissiblePurposeValue(String value) {
        this.permissiblePurposeValue = value;
    }

    /**
     * Gets the value of the endUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUserName() {
        return endUserName;
    }

    /**
     * Sets the value of the endUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUserName(String value) {
        this.endUserName = value;
    }

    /**
     * Gets the value of the primaryCreditBureauToContactIndicator property.
     * 
     */
    public boolean isPrimaryCreditBureauToContactIndicator() {
        return primaryCreditBureauToContactIndicator;
    }

    /**
     * Sets the value of the primaryCreditBureauToContactIndicator property.
     * 
     */
    public void setPrimaryCreditBureauToContactIndicator(boolean value) {
        this.primaryCreditBureauToContactIndicator = value;
    }

}
