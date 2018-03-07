
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USPatriotActComplianceRiskScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USPatriotActComplianceRiskScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComplianceRiskClassIndex" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ComplianceRiskIndex" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "USPatriotActComplianceRiskScore", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "complianceRiskClassIndex",
    "complianceRiskIndex"
})
public class USPatriotActComplianceRiskScore {

    @XmlElement(name = "ComplianceRiskClassIndex")
    protected String complianceRiskClassIndex;
    @XmlElement(name = "ComplianceRiskIndex")
    protected Integer complianceRiskIndex;

    /**
     * Gets the value of the complianceRiskClassIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceRiskClassIndex() {
        return complianceRiskClassIndex;
    }

    /**
     * Sets the value of the complianceRiskClassIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceRiskClassIndex(String value) {
        this.complianceRiskClassIndex = value;
    }

    /**
     * Gets the value of the complianceRiskIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplianceRiskIndex() {
        return complianceRiskIndex;
    }

    /**
     * Sets the value of the complianceRiskIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplianceRiskIndex(Integer value) {
        this.complianceRiskIndex = value;
    }

}
