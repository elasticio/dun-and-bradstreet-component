
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * A numeric value ranging from 1 to 100 assigned to a supplier using a scoring model used to predict the risk of doing business with this supplier. Value 1 denotes lowest risk and 100 denotes highest risk.
 *          
 * 
 * <p>Java class for SupplierRiskScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierRiskScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RawScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskPriorityValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
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
@XmlType(name = "SupplierRiskScore", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "rawScore",
    "riskPriorityValue"
})
public class SupplierRiskScore {

    @XmlElement(name = "RawScore", required = true)
    protected String rawScore;
    @XmlElement(name = "RiskPriorityValue")
    protected String riskPriorityValue;

    /**
     * Gets the value of the rawScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawScore() {
        return rawScore;
    }

    /**
     * Sets the value of the rawScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawScore(String value) {
        this.rawScore = value;
    }

    /**
     * Gets the value of the riskPriorityValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskPriorityValue() {
        return riskPriorityValue;
    }

    /**
     * Sets the value of the riskPriorityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskPriorityValue(String value) {
        this.riskPriorityValue = value;
    }

}
