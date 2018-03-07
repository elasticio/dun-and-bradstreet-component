
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultMessageID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResultDescription">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NonSpecificDataProviderText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
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
@XmlType(name = "ResultMessage", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "resultMessageID",
    "resultDescription",
    "nonSpecificDataProviderText"
})
public class ResultMessage {

    @XmlElement(name = "ResultMessageID")
    protected String resultMessageID;
    @XmlElement(name = "ResultDescription", required = true)
    protected String resultDescription;
    @XmlElement(name = "NonSpecificDataProviderText")
    protected String nonSpecificDataProviderText;

    /**
     * Gets the value of the resultMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMessageID() {
        return resultMessageID;
    }

    /**
     * Sets the value of the resultMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMessageID(String value) {
        this.resultMessageID = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
    }

    /**
     * Gets the value of the nonSpecificDataProviderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonSpecificDataProviderText() {
        return nonSpecificDataProviderText;
    }

    /**
     * Sets the value of the nonSpecificDataProviderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonSpecificDataProviderText(String value) {
        this.nonSpecificDataProviderText = value;
    }

}
