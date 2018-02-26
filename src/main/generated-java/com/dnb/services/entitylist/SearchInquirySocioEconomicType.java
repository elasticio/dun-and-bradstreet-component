
package com.dnb.services.entitylist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchInquirySocioEconomicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchInquirySocioEconomicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinorityOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FemaleOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EthnicClassificationCode" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://services.dnb.com/EntityListServiceV2.0}DNBCodeValueType">
 *               &lt;totalDigits value="7"/>
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
@XmlType(name = "SearchInquirySocioEconomicType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "minorityOwnedIndicator",
    "femaleOwnedIndicator",
    "ethnicClassificationCode"
})
public class SearchInquirySocioEconomicType {

    @XmlElement(name = "MinorityOwnedIndicator")
    protected Boolean minorityOwnedIndicator;
    @XmlElement(name = "FemaleOwnedIndicator")
    protected Boolean femaleOwnedIndicator;
    @XmlElement(name = "EthnicClassificationCode")
    protected List<BigInteger> ethnicClassificationCode;

    /**
     * Gets the value of the minorityOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorityOwnedIndicator() {
        return minorityOwnedIndicator;
    }

    /**
     * Sets the value of the minorityOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorityOwnedIndicator(Boolean value) {
        this.minorityOwnedIndicator = value;
    }

    /**
     * Gets the value of the femaleOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFemaleOwnedIndicator() {
        return femaleOwnedIndicator;
    }

    /**
     * Sets the value of the femaleOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFemaleOwnedIndicator(Boolean value) {
        this.femaleOwnedIndicator = value;
    }

    /**
     * Gets the value of the ethnicClassificationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ethnicClassificationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEthnicClassificationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getEthnicClassificationCode() {
        if (ethnicClassificationCode == null) {
            ethnicClassificationCode = new ArrayList<BigInteger>();
        }
        return this.ethnicClassificationCode;
    }

}
