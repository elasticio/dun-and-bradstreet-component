
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the most recent scores that are assigned to this organization that predicts how well the organization as a supplier is performing for its customers.
 *          
 * 
 * <p>Java class for SupplierPerformanceScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierPerformanceScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverallPerformanceScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "SupplierPerformanceScoreType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "overallPerformanceScore"
})
public class SupplierPerformanceScoreType {

    @XmlElement(name = "OverallPerformanceScore", required = true)
    protected String overallPerformanceScore;

    /**
     * Gets the value of the overallPerformanceScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallPerformanceScore() {
        return overallPerformanceScore;
    }

    /**
     * Sets the value of the overallPerformanceScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallPerformanceScore(String value) {
        this.overallPerformanceScore = value;
    }

}
