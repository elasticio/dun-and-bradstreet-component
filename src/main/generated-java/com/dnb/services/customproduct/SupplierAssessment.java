
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop that to record the most recently generated score for a Supplier.
 *          
 * 
 * <p>Java class for SupplierAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierRiskScore" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierRiskScore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierAssessment", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "supplierRiskScore"
})
public class SupplierAssessment {

    @XmlElement(name = "SupplierRiskScore")
    protected SupplierRiskScore supplierRiskScore;

    /**
     * Gets the value of the supplierRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierRiskScore }
     *     
     */
    public SupplierRiskScore getSupplierRiskScore() {
        return supplierRiskScore;
    }

    /**
     * Sets the value of the supplierRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRiskScore }
     *     
     */
    public void setSupplierRiskScore(SupplierRiskScore value) {
        this.supplierRiskScore = value;
    }

}
