
package com.dnb.services.entitylist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipEthnicityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnershipEthnicityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}SocioEconomicReferenceDetailType">
 *       &lt;sequence>
 *         &lt;element name="EthnicClassificationVerifiedDate" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TypeText" type="{http://services.dnb.com/EntityListServiceV2.0}StringBaseType256" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/EntityListServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnershipEthnicityType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "ethnicClassificationVerifiedDate"
})
public class OwnershipEthnicityType
    extends SocioEconomicReferenceDetailType
{

    @XmlElement(name = "EthnicClassificationVerifiedDate")
    protected DNBDateType ethnicClassificationVerifiedDate;
    @XmlAttribute(name = "TypeText")
    protected String typeText;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;

    /**
     * Gets the value of the ethnicClassificationVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEthnicClassificationVerifiedDate() {
        return ethnicClassificationVerifiedDate;
    }

    /**
     * Sets the value of the ethnicClassificationVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEthnicClassificationVerifiedDate(DNBDateType value) {
        this.ethnicClassificationVerifiedDate = value;
    }

    /**
     * Gets the value of the typeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeText() {
        return typeText;
    }

    /**
     * Sets the value of the typeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeText(String value) {
        this.typeText = value;
    }

    /**
     * Gets the value of the dnbCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBCodeValue() {
        return dnbCodeValue;
    }

    /**
     * Sets the value of the dnbCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBCodeValue(BigInteger value) {
        this.dnbCodeValue = value;
    }

    /**
     * Gets the value of the dnbCodeTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDNBCodeTableNumber() {
        return dnbCodeTableNumber;
    }

    /**
     * Sets the value of the dnbCodeTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDNBCodeTableNumber(Integer value) {
        this.dnbCodeTableNumber = value;
    }

}
